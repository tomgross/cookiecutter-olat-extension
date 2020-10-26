package ch.uzh.olat.lms.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.{{ cookiecutter.appname }}.node.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.form.flexible.FormItem;
import org.olat.core.gui.components.form.flexible.FormItemContainer;
import org.olat.core.gui.components.form.flexible.impl.FormBasicController;
import org.olat.core.gui.components.form.flexible.impl.FormEvent;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.WindowControl;


public class EditConfigurationController extends FormBasicController {

  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode;

  public EditConfigurationController(
      UserRequest userRequest, WindowControl windowControl, {{ cookiecutter.appnameUpper }}CourseNode courseNode) {
    super(userRequest, windowControl);
    this.courseNode = courseNode;
    initForm(userRequest);
  }

  @Override
  protected void initForm(
      FormItemContainer formLayout, Controller listener, UserRequest userRequest) {
    setFormTitle("edit_config.title");
  }

  @Override
  protected void formInnerEvent(UserRequest userRequest, FormItem source, FormEvent event) {

  }

  @Override
  protected void formOK(UserRequest userRequest) {}

  @Override
  protected void doDispose() {}
  
}
