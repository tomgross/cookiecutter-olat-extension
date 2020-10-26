package ch.uzh.olat.lms.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.{{ cookiecutter.appname }}.node.{{ cookiecutter.appnameUpper }}CourseNode;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.form.flexible.FormItem;
import org.olat.core.gui.components.form.flexible.FormItemContainer;
import org.olat.core.gui.components.form.flexible.impl.FormBasicController;
import org.olat.core.gui.components.form.flexible.impl.FormEvent;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;


@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public class EditAdministrationController extends FormBasicController {

  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode;

  public EditAdministrationController(
      UserRequest userRequest, WindowControl windowControl, {{ cookiecutter.appnameUpper }}CourseNode courseNode) {
    super(userRequest, windowControl);
    this.courseNode = courseNode;
    initForm(userRequest);
  }

  @Override
  protected void initForm(
      FormItemContainer formLayout, Controller listener, UserRequest userRequest) {
    setFormTitle("edit_admin.title");
  }

  @Override
  protected void formInnerEvent(UserRequest userRequest, FormItem source, FormEvent event) {
      fireEvent(userRequest, Event.CHANGED_EVENT);
  }

  @Override
  protected void formOK(UserRequest userRequest) {}

  @Override
  protected void doDispose() {}

}
