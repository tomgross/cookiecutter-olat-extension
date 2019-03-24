package ch.uzh.extension.{{ cookiecutter.appname }}.environment;

import org.olat.basesecurity.Authentication;
import org.olat.basesecurity.BaseSecurityManager;
import org.olat.core.id.Identity;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

import static ch.uzh.extension.tool.EnvironmentProperties.PRODUCTION;


@Profile(PRODUCTION)
public interface {{ cookiecutter.appnameUpper }}ProductionEnvironmentProperties extends {{ cookiecutter.appnameUpper }}EnvironmentProperties {


}
