package ch.uzh.extension.{{ cookiecutter.appname }}.environment;

import org.springframework.context.annotation.Profile;

import static ch.uzh.extension.tool.EnvironmentProperties.DEVELOPMENT;
import static ch.uzh.extension.tool.EnvironmentProperties.PRODUCTION_COMPILATION_DEVELOPMENT;


@Profile({DEVELOPMENT, PRODUCTION_COMPILATION_DEVELOPMENT})
public interface {{ cookiecutter.appnameUpper }}DevelopmentEnvironmentProperties extends
		{{ cookiecutter.appnameUpper }}EnvironmentProperties {

}
