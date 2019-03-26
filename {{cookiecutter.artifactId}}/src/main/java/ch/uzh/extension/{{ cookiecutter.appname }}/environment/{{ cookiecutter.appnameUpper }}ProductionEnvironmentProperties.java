package ch.uzh.extension.{{ cookiecutter.appname }}.environment;

import org.springframework.context.annotation.Profile;

import static ch.uzh.extension.tool.EnvironmentProperties.PRODUCTION;


@Profile(PRODUCTION)
public interface {{ cookiecutter.appnameUpper }}ProductionEnvironmentProperties extends {{ cookiecutter.appnameUpper }}EnvironmentProperties {


}
