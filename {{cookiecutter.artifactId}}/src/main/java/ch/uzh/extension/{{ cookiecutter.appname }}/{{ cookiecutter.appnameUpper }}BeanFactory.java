package ch.uzh.extension.{{ cookiecutter.appname }};

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller.{{ cookiecutter.appnameUpper }}NodeEditController;
import ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller.{{ cookiecutter.appnameUpper }}NodeRunController;
import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.control.WindowControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class {{ cookiecutter.appnameUpper }}BeanFactory {

	private final LmsuzhTranslator lmsuzhTranslator;


	@Autowired
	public {{ cookiecutter.appnameUpper }}BeanFactory(LmsuzhTranslator lmsuzhTranslator) {
		this.lmsuzhTranslator = lmsuzhTranslator;
	}

	public {{ cookiecutter.appnameUpper }}NodeEditController createNodeEditController(
			UserRequest userRequest, WindowControl windowControl) {
		return new {{ cookiecutter.appnameUpper }}NodeEditController(
				userRequest, windowControl, lmsuzhTranslator
		);
	}

	public {{ cookiecutter.appnameUpper }}NodeRunController create{{ cookiecutter.appnameUpper }}NodeRunController(
			{{ cookiecutter.appnameUpper }}CourseNode courseNode, UserRequest userRequest, WindowControl windowControl) {
		return new {{ cookiecutter.appnameUpper }}NodeRunController(
				userRequest, windowControl, courseNode, lmsuzhTranslator);
	}

}
