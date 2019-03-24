package ch.uzh.extension.{{ cookiecutter.appname }}.environment;

import org.springframework.context.annotation.Profile;

import static ch.uzh.extension.tool.EnvironmentProperties.TESTING;


@Profile(TESTING)
public interface {{ cookiecutter.appnameUpper }}TestingEnvironmentProperties extends {{ cookiecutter.appnameUpper }}EnvironmentProperties {


}
