package ch.uzh.olat.lms.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.{{ cookiecutter.appname }}.node.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.velocity.VelocityContainer;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.controller.BasicController;


public class {{ cookiecutter.appnameUpper }}RunController extends BasicController {

  private VelocityContainer container;
  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode;

  public {{ cookiecutter.appnameUpper }}RunController(
      UserRequest userRequest, WindowControl windowControl, {{ cookiecutter.appnameUpper }}CourseNode courseNode) {
    super(userRequest, windowControl);
    this.courseNode = courseNode;
    container = createVelocityContainer("run");
    putInitialPanel(container);
  }

  @Override
  protected void event(
      UserRequest userRequest, Component source, org.olat.core.gui.control.Event event) {

  }

  @Override
  protected void doDispose() {
    
  }

}
