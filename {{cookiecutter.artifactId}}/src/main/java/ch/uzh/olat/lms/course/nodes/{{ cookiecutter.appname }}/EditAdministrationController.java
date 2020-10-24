package ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appname }};

import ch.uzh.olat.lms.course.nodes.{{ cookiecutter.appnameUpper }}CourseNode;

import org.olat.basesecurity.BaseSecurity;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.form.flexible.FormItem;
import org.olat.core.gui.components.form.flexible.FormItemContainer;
import org.olat.core.gui.components.form.flexible.elements.FlexiTableElement;
import org.olat.core.gui.components.form.flexible.impl.FormBasicController;
import org.olat.core.gui.components.form.flexible.impl.FormEvent;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.repository.RepositoryService;
import org.olat.resource.OLATResourceManager;
import org.springframework.beans.factory.annotation.Autowired;


@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public class EditAdministrationController extends FormBasicController {

  private final {{ cookiecutter.appnameUpper }}CourseNode courseNode

  @Autowired private RepositoryService repositoryService;

  @Autowired private OLATResourceManager resourceManager;

  @Autowired private BaseSecurity baseSecurity;

  @Autowired private UserService userService;

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