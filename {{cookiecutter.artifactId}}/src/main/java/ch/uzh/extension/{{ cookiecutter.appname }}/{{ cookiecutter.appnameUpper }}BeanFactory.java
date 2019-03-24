package ch.uzh.extension.{{ cookiecutter.appname }};

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller.{{ cookiecutter.appnameUpper }}NodeEditController;
import ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller.{{ cookiecutter.appnameUpper }}NodeRunController;
import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.control.WindowControl;
import org.olat.course.ICourse;
import org.olat.course.run.userview.UserCourseEnvironment;
import org.olat.repository.manager.RepositoryEntryDAO;
import org.olat.repository.manager.RepositoryEntryRelationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Configuration
public abstract class {{ cookiecutter.appnameUpper }}BeanFactory {

	private final LmsuzhTranslator lmsuzhTranslator;

	private final RepositoryEntryDAO repositoryEntryDAO;

	private final RepositoryEntryRelationDAO repositoryEntryRelationDAO;

	@Autowired
	public {{ cookiecutter.appnameUpper }}BeanFactory(LmsuzhTranslator lmsuzhTranslator,
							   RepositoryEntryDAO repositoryEntryDAO,
							   RepositoryEntryRelationDAO repositoryEntryRelationDAO) {
		this.lmsuzhTranslator = lmsuzhTranslator;
		this.repositoryEntryDAO = repositoryEntryDAO;
		this.repositoryEntryRelationDAO = repositoryEntryRelationDAO;
	}

	public {{ cookiecutter.appnameUpper }}NodeEditController createNodeEditController(UserRequest userRequest,
		WindowControl windowControl,
		ICourse courseResource,
		UserCourseEnvironment userCourseEnvironment) {
		return new {{ cookiecutter.appnameUpper }}NodeEditController(this, userRequest,
		windowControl, courseResource, userCourseEnvironment, lmsuzhTranslator);
	}

	public {{ cookiecutter.appnameUpper }}NodeRunController create{{ cookiecutter.appnameUpper }}NodeRunController(
			{{ cookiecutter.appnameUpper }}CourseNode courseNode, UserRequest userRequest, WindowControl windowControl) {
		return new {{ cookiecutter.appnameUpper }}NodeRunController(
				userRequest, windowControl, courseNode, lmsuzhTranslator);
	}

}
