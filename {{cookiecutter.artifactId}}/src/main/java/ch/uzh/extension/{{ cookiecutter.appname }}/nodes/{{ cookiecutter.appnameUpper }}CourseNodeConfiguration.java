package ch.uzh.extension.{{ cookiecutter.appname }}.nodes;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}BeanFactory;
import org.olat.course.nodes.AbstractCourseNodeConfiguration;
import org.olat.course.nodes.CourseNode;
import org.olat.course.nodes.CourseNodeGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Locale;

import static ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix.prefix;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class {{ cookiecutter.appnameUpper }}CourseNodeConfiguration extends AbstractCourseNodeConfiguration {

	public final static String ALIAS = "{{ cookiecutter.appname }}";

	private final {{ cookiecutter.appnameUpper }}CourseNode {{ cookiecutter.appname }}CourseNode;
	private final LmsuzhTranslator translator;

	@Autowired
	{{ cookiecutter.appnameUpper }}CourseNodeConfiguration({{ cookiecutter.appnameUpper }}CourseNode {{ cookiecutter.appname }}CourseNode,
									LmsuzhTranslator translator) {
		this.{{ cookiecutter.appname }}CourseNode = {{ cookiecutter.appname }}CourseNode;
		this.translator = translator;
		setOrder(250);
	}

	@Override
	public String getAlias() {
		return ALIAS;
	}

	@Override
	public String getGroup() {
		return CourseNodeGroup.content.name();
	}

	@Override
	public CourseNode getInstance() {
		return new {{ cookiecutter.appnameUpper }}CourseNode({{ cookiecutter.appname }}CourseNode.{{ cookiecutter.appname }}BeanFactory);
	}

	@Override
	public String getLinkText(Locale locale) {
		return translator.translate(prefix, "course.node.title");
	}

	@Override
	public String getIconCSSClass() {
		return "o_podcast_icon";
		// return "o_{{ cookiecutter.appname }}_icon";
	}
}
