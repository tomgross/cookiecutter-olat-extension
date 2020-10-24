package ch.uzh.olat.lms;

import ch.uzh.olat.lms.core.module.Module;
import org.springframework.stereotype.Component;

@Component
public class {{ cookiecutter.appnameUpper }}Module implements Module {

  @Override
  public String getName() {
    return "{{ cookiecutter.appnameUpper }}";
  }

  @Override
  public boolean isEnabled() {
    // TODO {{ cookiecutter.appnameUpper }} module is always enabled.
    // Maybe we add the possibility to disable the module later?
    // https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/html/spring-boot-features.html#boot-features-developing-auto-configuration
    return true;
  }
}
