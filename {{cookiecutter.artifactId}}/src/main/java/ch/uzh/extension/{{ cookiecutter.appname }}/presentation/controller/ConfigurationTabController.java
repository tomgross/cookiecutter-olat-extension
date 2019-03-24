package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.velocity.VelocityContainer;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.controller.BasicController;

/**
 * This controller displays the configuration tab in the course editor.
 */
public class ConfigurationTabController extends BasicController {

	private VelocityContainer velocityContainer;

	ConfigurationTabController(UserRequest userRequest, WindowControl windowControl,
							   LmsuzhTranslator translator) {
		super(userRequest, windowControl, translator.getLegacyTranslator({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class));
		velocityContainer = createVelocityContainer("configuration_tab");
		putInitialPanel(velocityContainer);
	}

	@Override
	protected void event(UserRequest userRequest, Controller source, Event event) {
		if (event == Event.DONE_EVENT) {
			fireEvent(userRequest, event);
		}
	}

	@Override
	protected void event(UserRequest userRequest, Component source, Event event) {
	}

	@Override
	protected void doDispose() {
	}
}
