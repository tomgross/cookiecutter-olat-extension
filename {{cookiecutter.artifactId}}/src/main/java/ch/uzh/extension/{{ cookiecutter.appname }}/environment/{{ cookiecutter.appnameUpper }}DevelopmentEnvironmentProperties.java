package ch.uzh.extension.{{ cookiecutter.appname }}.environment;

import org.olat.core.id.Identity;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

import static ch.uzh.extension.tool.EnvironmentProperties.DEVELOPMENT;
import static ch.uzh.extension.tool.EnvironmentProperties.PRODUCTION_COMPILATION_DEVELOPMENT;


@Profile({DEVELOPMENT, PRODUCTION_COMPILATION_DEVELOPMENT})
public interface {{ cookiecutter.appnameUpper }}DevelopmentEnvironmentProperties extends
		{{ cookiecutter.appnameUpper }}EnvironmentProperties {

}
