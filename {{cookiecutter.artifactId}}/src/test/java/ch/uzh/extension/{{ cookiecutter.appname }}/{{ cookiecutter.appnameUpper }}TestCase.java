package ch.uzh.extension.{{ cookiecutter.appname }};

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.olat.core.commons.persistence.DB;
import org.olat.core.logging.OLog;
import org.olat.core.logging.Tracing;
import org.olat.test.MockServletContextWebContextLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 */
@DependsOn("databaseMigrator")
@ContextConfiguration(loader = MockServletContextWebContextLoader.class, locations = {
	"classpath:/org/olat/_spring/mainContext.xml",
	"classpath:{{ cookiecutter.appname }}TestContext.xml"})
@SuppressWarnings("initialization.fields.uninitialized")
public abstract class {{ cookiecutter.appnameUpper }}TestCase extends AbstractJUnit4SpringContextTests {

	private static final OLog LOG = Tracing.createLoggerFor({{ cookiecutter.appnameUpper }}TestCase.class);

	@Autowired
	protected DB dbInstance;

	@Rule
	public TestName testName = new TestName();

	@Before
	public void logTestedMethod() {
		LOG.info("Method run: " + testName.getMethodName() + "(" + this.getClass().getCanonicalName() + ")");
	}

	@After
	public void closeConnectionAfter() {
		LOG.info("Method test finished: " + testName.getMethodName() + "(" + this.getClass().getCanonicalName() + ")");
		dbInstance.rollbackTransactionAndCloseEntityManager();
	}
}
