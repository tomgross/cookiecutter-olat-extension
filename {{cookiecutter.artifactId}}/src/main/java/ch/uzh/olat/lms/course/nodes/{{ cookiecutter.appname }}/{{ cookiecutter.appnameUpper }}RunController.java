package ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.velocity.VelocityContainer;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.controller.BasicController;
import org.olat.util.logging.activity.LoggingResourceable;


public class {{ cookiecutter.appnameUpper }}RunController extends BasicController {

  private VelocityContainer container;
  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode;

  public {{ cookiecutter.appnameUpper }}RunController(
      UserRequest userRequest, WindowControl windowControl, {{ cookiecutter.appnameUpper }}CourseNode courseNode) {
    super(userRequest, windowControl);
    this.courseNode = courseNode;
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
