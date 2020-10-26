package ch.uzh.olat.lms.{{ cookiecutter.appname }}.node;

import ch.uzh.olat.lms.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}EditController;
import ch.uzh.olat.lms.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}RunController;
import ch.uzh.olat.lms.{{ cookiecutter.appname }}.model.CourseNodeData;
import java.io.File;
import lombok.Getter;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.generic.tabbable.TabbableController;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.stack.BreadcrumbPanel;
import org.olat.core.gui.control.WindowControl;
import org.olat.course.ICourse;
import org.olat.course.editor.CourseEditorEnv;
import org.olat.course.editor.NodeEditController;
import org.olat.course.editor.StatusDescription;
import org.olat.course.export.CourseEnvironmentMapper;
import org.olat.course.nodes.AbstractAccessableCourseNode;
import org.olat.course.nodes.CourseNode;
import org.olat.course.nodes.TitledWrapperHelper;
import org.olat.course.run.navigation.NodeRunConstructionResult;
import org.olat.course.run.userview.NodeEvaluation;
import org.olat.course.run.userview.UserCourseEnvironment;
import org.olat.repository.RepositoryEntry;


public class {{ cookiecutter.appnameUpper }}CourseNode extends AbstractAccessableCourseNode {

  @Getter
  private CourseNodeData data;

  public {{ cookiecutter.appnameUpper }}CourseNode(String type) {
    super(type);
    updateModuleConfigDefaults(true);
    data = new CourseNodeData();
  }

  @Override
  public NodeRunConstructionResult createNodeRunConstructionResult(
      UserRequest userRequest,
      WindowControl windowControl,
      UserCourseEnvironment courseEnvironment,
      NodeEvaluation nodeEvaluation,
      String nodecmd) {
    updateModuleConfigDefaults(false);
    Controller controller = new {{ cookiecutter.appnameUpper }}RunController(userRequest, windowControl, this);
    return new NodeRunConstructionResult(
        TitledWrapperHelper.getWrapper(
            userRequest, windowControl, controller, this, "o_podcast_icon"));
  }

  @Override
  public TabbableController createEditController(
      UserRequest userRequest,
      WindowControl windowControl,
      BreadcrumbPanel stackPanel,
      ICourse course,
      UserCourseEnvironment courseEnvironment) {
    updateModuleConfigDefaults(false);
    data.setResourceableId(course.getResourceableId());
    {{ cookiecutter.appnameUpper }}EditController editController =
        new {{ cookiecutter.appnameUpper }}EditController(userRequest, windowControl, this, course, courseEnvironment);
    CourseNode chosenNode =
        course
            .getEditorTreeModel()
            .getCourseNode(courseEnvironment.getCourseEditorEnv().getCurrentCourseNodeId());
    return new NodeEditController(
        userRequest,
        windowControl,
        course.getEditorTreeModel(),
        course,
        chosenNode,
        courseEnvironment,
        editController);
  }

  @Override
  public void postCopy(
      CourseEnvironmentMapper environmentMapper,
      Processing processType,
      ICourse course,
      ICourse sourceCrourse) {
    super.postCopy(environmentMapper, processType, course, sourceCrourse);
    data.setResourceableId(course.getResourceableId());
  }

  @Override
  public void postImport(
      File importDirectory,
      ICourse course,
      CourseEnvironmentMapper environmentMapper,
      Processing processType) {
    super.postImport(importDirectory, course, environmentMapper, processType);
    data.setResourceableId(course.getResourceableId());
  }

  @Override
  public StatusDescription[] isConfigValid(CourseEditorEnv cev) {
    return new StatusDescription[0];
  }

  @Override
  public StatusDescription isConfigValid() {
    return StatusDescription.NOERROR;
  }

  @Override
  public boolean needsReferenceToARepositoryEntry() {
    return false;
  }

  @Override
  public RepositoryEntry getReferencedRepositoryEntry() {
    return null;
  }
}
