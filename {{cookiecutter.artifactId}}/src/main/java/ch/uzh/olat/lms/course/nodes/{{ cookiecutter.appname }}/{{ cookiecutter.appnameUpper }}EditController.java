package ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appnameUpper }}CourseNode;

import org.olat.basesecurity.BaseSecurity;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.tabbedpane.TabbedPane;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.generic.tabbable.ActivateableTabbableDefaultController;
import org.olat.core.id.OLATResourceable;
import org.olat.course.CourseFactory;
import org.olat.course.ICourse;
import org.olat.course.assessment.AssessmentHelper;
import org.olat.course.condition.Condition;
import org.olat.course.condition.ConditionEditController;
import org.olat.course.editor.NodeEditController;
import org.olat.course.run.userview.UserCourseEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public class {{ cookiecutter.appnameUpper }}EditController extends ActivateableTabbableDefaultController {

  private static final String PANE_TAB_ACCESSIBILITY = "pane.tab.accessibility";
  private static final String PANE_TAB_EVENTS = "pane.tab.events";
  private static final String PANE_TAB_SERIES = "pane.tab.series";
  private static final String PANE_TAB_CONFIGURATION = "pane.tab.configuration";
  private static final String PANE_TAB_ADMINISTRATION = "pane.tab.administration";
  private static final String[] PANE_KEYS = {
    PANE_TAB_ACCESSIBILITY, PANE_TAB_SERIES, PANE_TAB_CONFIGURATION, PANE_TAB_ADMINISTRATION
  };

  private TabbedPane myTabbedPane;
  private final ConditionEditController accessibilityConditionEditController;
  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode;
  private final EditConfigurationController editConfigurationController;
  private final EditAdministrationController editAdministrationController;

  @Autowired private BaseSecurity baseSecurity;
  
  public {{ cookiecutter.appnameUpper }}EditController(
      UserRequest userRequest,
      WindowControl windowControl,
      {{ cookiecutter.appnameUpper }}CourseNode courseNode,
      OLATResourceable olatResource,
      UserCourseEnvironment courseEnvironment) {
    super(userRequest, windowControl);
    this.courseNode = courseNode;

    Condition accessCondition = courseNode.getPreConditionAccess();
    ICourse course = CourseFactory.loadCourse(olatResource);
    accessibilityConditionEditController =
        new ConditionEditController(
            userRequest,
            windowControl,
            courseEnvironment,
            accessCondition,
            AssessmentHelper.getAssessableNodes(course.getEditorTreeModel(), courseNode));
    listenTo(accessibilityConditionEditController);

    editConfigurationController =
        new EditConfigurationController(userRequest, windowControl, courseNode);
    listenTo(editConfigurationController);
    editAdministrationController =
        new EditAdministrationController(userRequest, windowControl, courseNode);
    listenTo(editAdministrationController);
  }

  @Override
  public void addTabs(TabbedPane tabbedPane) {
    myTabbedPane = tabbedPane;
    tabbedPane.addTab(
        translate(PANE_TAB_ACCESSIBILITY),
        accessibilityConditionEditController.getWrappedDefaultAccessConditionVC(
            translate("condition.accessibility.title")));
    tabbedPane.addTab(
        translate(PANE_TAB_CONFIGURATION), editConfigurationController.getInitialComponent());
    if (baseSecurity.getRoles(getIdentity()).isAdministrator()) {
      tabbedPane.addTab(
          translate(PANE_TAB_ADMINISTRATION), editAdministrationController.getInitialComponent());
    }
  }

  @Override
  public String[] getPaneKeys() {
    return PANE_KEYS;
  }

  @Override
  public TabbedPane getTabbedPane() {
    return myTabbedPane;
  }

  @Override
  protected void event(UserRequest userRequest, Controller source, Event event) {
    if (source == accessibilityConditionEditController) {
      if (event == Event.CHANGED_EVENT) {
        Condition cond = accessibilityConditionEditController.getCondition();
        courseNode.setPreConditionAccess(cond);
        fireEvent(userRequest, NodeEditController.NODECONFIG_CHANGED_EVENT);
      }
    } else if (source == editConfigurationController) {
      if (event == Event.CHANGED_EVENT) {
        fireEvent(userRequest, NodeEditController.NODECONFIG_CHANGED_EVENT);
      }
    } else if (source == editAdministrationController) {
      if (event == Event.CHANGED_EVENT) {
        fireEvent(userRequest, NodeEditController.NODECONFIG_CHANGED_EVENT);
      }
    }
  }

  @Override
  protected void event(UserRequest userRequest, Component source, Event event) {}

  @Override
  protected void doDispose() {}
}
