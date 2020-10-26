package ch.uzh.olat.lms.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.{{ cookiecutter.appname }}.node.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.translator.Translator;
import org.olat.core.util.Util;
import org.olat.course.nodes.AbstractCourseNodeConfiguration;
import org.olat.course.nodes.CourseNode;
import org.olat.course.nodes.CourseNodeGroup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class {{ cookiecutter.appnameUpper }}CourseNodeConfiguration extends AbstractCourseNodeConfiguration {

  private static final String ALIAS = "pr";

  public {{ cookiecutter.appnameUpper }}CourseNodeConfiguration() {
    setOrder(1000);
  }

  @Override
	public String getAlias() {
		return ALIAS;
	}

  @Override
  public CourseNode getInstance() {
    return new {{ cookiecutter.appnameUpper }}CourseNode(ALIAS);
  }

  @Override
  public String getGroup() {
    return CourseNodeGroup.content.name();
  }

  @Override
  public String getLinkText(Locale locale) {
    Translator translator = Util.createPackageTranslator(this.getClass(), locale);
    return translator.translate("title_{{ cookiecutter.appname }}");
  }

  @Override
  public String getIconCSSClass() {
    return "o_{{ cookiecutter.appname }}_icon";
  }
}