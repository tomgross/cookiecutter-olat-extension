package ch.uzh.extension.{{ cookiecutter.appname }}.nodes;

import ch.uzh.extension.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}BeanFactory;
import ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller.{{ cookiecutter.appnameUpper }}NodeEditController;
import ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller.{{ cookiecutter.appnameUpper }}NodeRunController;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.stack.BreadcrumbPanel;
import org.olat.core.gui.control.WindowControl;
import org.olat.course.ICourse;
import org.olat.course.editor.CourseEditorEnv;
import org.olat.course.editor.NodeEditController;
import org.olat.course.editor.StatusDescription;
import org.olat.course.nodes.AbstractAccessableCourseNode;
import org.olat.course.run.navigation.NodeRunConstructionResult;
import org.olat.course.run.userview.NodeEvaluation;
import org.olat.course.run.userview.UserCourseEnvironment;
import org.olat.repository.RepositoryEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Configurable(preConstruction = true)
public class {{ cookiecutter.appnameUpper }}CourseNode extends AbstractAccessableCourseNode {

	private static final long serialVersionUID = -{{ range(11565253926887733, 99565253926887733) | random }}L;

	@Autowired
	public transient final {{ cookiecutter.appnameUpper }}BeanFactory {{ cookiecutter.appname }}BeanFactory;

	@Autowired
	public {{ cookiecutter.appnameUpper }}CourseNode({{ cookiecutter.appnameUpper }}BeanFactory {{ cookiecutter.appname }}BeanFactory) {
		super({{ cookiecutter.appnameUpper }}CourseNodeConfiguration.ALIAS);
		this.{{ cookiecutter.appname }}BeanFactory = {{ cookiecutter.appname }}BeanFactory;
	}

	@Override
	public NodeEditController createEditController(UserRequest userRequest,
												   WindowControl windowControl,
												   BreadcrumbPanel stackPanel,
												   ICourse course,
												   UserCourseEnvironment userCourseEnvironment) {
		{{ cookiecutter.appnameUpper }}NodeEditController childTabCntrllr = {{ cookiecutter.appname }}BeanFactory.createNodeEditController(userRequest, windowControl,
			course, userCourseEnvironment);
		NodeEditController nodeEditController = new NodeEditController(userRequest, windowControl, course.getEditorTreeModel(), course, userCourseEnvironment, childTabCntrllr);
		return nodeEditController;
	}

	@Override
	public StatusDescription isConfigValid() {
		return StatusDescription.NOERROR;
	}

	@Override
	public RepositoryEntry getReferencedRepositoryEntry() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean needsReferenceToARepositoryEntry() {
		return false;
	}

	@Override
	public NodeRunConstructionResult createNodeRunConstructionResult(
			UserRequest userRequest, WindowControl windowControl,
			UserCourseEnvironment userCourseEnvironment, NodeEvaluation nodeEvaluation,
			String nodecmd) {
		{{ cookiecutter.appnameUpper }}NodeRunController controller = {{ cookiecutter.appname }}BeanFactory.create{{ cookiecutter.appnameUpper }}NodeRunController(this, userRequest, windowControl);
		return new NodeRunConstructionResult(controller);
	}

	@Override
	public StatusDescription[] isConfigValid(CourseEditorEnv cev) {
		return new StatusDescription[0];
	}

}
