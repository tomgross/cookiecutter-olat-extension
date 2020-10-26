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
    return true;
  }
}
