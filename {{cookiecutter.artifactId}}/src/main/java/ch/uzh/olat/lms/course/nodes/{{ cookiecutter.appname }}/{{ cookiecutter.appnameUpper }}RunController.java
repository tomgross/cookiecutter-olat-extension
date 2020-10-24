package ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.velocity.VelocityContainer;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.controller.BasicController;
import org.olat.util.logging.activity.LoggingResourceable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class {{ cookiecutter.appnameUpper }}RunController extends BasicController {

  private VelocityContainer container;
  private RunListController runListController;
  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode;

  @Autowired
  @SuppressWarnings("SpringJavaAutowiredMembersInspection")
  private RestClient restClient;

  public {{ cookiecutter.appnameUpper }}RunController(
      UserRequest userRequest, WindowControl windowControl, {{ cookiecutter.appnameUpper }}CourseNode courseNode) {
    super(userRequest, windowControl);
    this.courseNode = courseNode;
    restClient = restClient.withUsers(courseNode.getData().getUsers());
    container = createVelocityContainer("run");
    putInitialPanel(container);
    addLoggingResourceable(LoggingResourceable.wrap(courseNode));
  }

  @Override
  protected void event(
      UserRequest userRequest, Component source, org.olat.core.gui.control.Event event) {}

  @Override
  protected void event(
      UserRequest userRequest, Controller source, org.olat.core.gui.control.Event event) {
  }

  @Override
  protected void doDispose() {}

  private void putController(BasicController controller) {
    container.put("controller", controller.getInitialComponent());
  }
}
