package ch.uzh.extension.{{ cookiecutter.appname }}.nodes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;

/**
 *
 */
@XStreamAlias("extensionModuleConfiguration")
public abstract class AbstractExtensionCourseNodeConfiguration implements Serializable {

    private int configurationVersion;

    public AbstractExtensionCourseNodeConfiguration(int configurationVersion) {
    	this.configurationVersion = configurationVersion;
	}

    public int getConfigurationVersion() {
        return configurationVersion;
    }

	public void setConfigurationVersion(int configurationVersion) {
		this.configurationVersion = configurationVersion;
	}

}
