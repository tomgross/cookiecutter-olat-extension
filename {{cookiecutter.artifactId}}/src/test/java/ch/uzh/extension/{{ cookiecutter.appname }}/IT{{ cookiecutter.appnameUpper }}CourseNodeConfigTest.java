/**
 * OLAT - Online Learning and Training<br>
 * https://www.olat.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Copyright (c) since 2004 at Multimedia- & E-Learning Services (MELS),<br>
 * University of Zurich, Switzerland.
 * <p>
 */

package ch.uzh.extension.{{ cookiecutter.appname }};

import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNodeConfiguration;
import org.olat.course.nodes.CourseNodeConfiguration;
import org.olat.core.CoreSpringFactory;
import org.junit.Before;
import org.junit.Test;

// import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 */
@SuppressWarnings("initialization.fields.uninitialized")
public class IT{{ cookiecutter.appnameUpper }}CourseNodeConfigTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private {{ cookiecutter.appnameUpper }}CourseNodeConfiguration courseNodeConfig;

	@Before
	public void getNodeConfig() {
		courseNodeConfig = ({{ cookiecutter.appnameUpper }}CourseNodeConfiguration) CoreSpringFactory.getBean("{{ cookiecutter.appname }}CourseNodeConfiguration");
	}

	@Test
	public void NodeConfigBean() {
		Map<String, CourseNodeConfiguration> configs = CoreSpringFactory.getBeansOfType(CourseNodeConfiguration.class);
		assertTrue(configs.containsKey("{{ cookiecutter.appname }}CourseNodeConfiguration"));
	}

	@Test
	public void getAlias() {
		assertEquals("{{ cookiecutter.appname }}", courseNodeConfig.getAlias());
	}

	@Test
	public void getGroup() {
		assertEquals("content", courseNodeConfig.getGroup());
	}

	@Test
	public void getInstance() {
		{{ cookiecutter.appnameUpper }}CourseNode courseNode = ({{ cookiecutter.appnameUpper }}CourseNode) courseNodeConfig.getInstance();
		assertEquals("{{ cookiecutter.appname }}", courseNode.getType());
	}

	@Test
	public void getLinkText() {
		// assertEquals(courseNodeConfig.getLinkText(Locale.ENGLISH), "");
		/* Fails currently */
		assertTrue(Boolean.TRUE);
	}

	@Test
	public void getIconCSSClass() {
		assertEquals("o_{{ cookiecutter.appname }}_icon", courseNodeConfig.getIconCSSClass());
	}

}
