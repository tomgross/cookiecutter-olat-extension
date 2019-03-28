package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}TestCase;
import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import org.junit.Before;
import org.junit.Test;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.UserRequestImpl;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.util.WindowControlMocker;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


@SuppressWarnings("initialization.fields.uninitialized")
public class ITConfigurationTabControllerTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private ConfigurationTabController configTabController;

	@Before
	public void createForm() {
		HttpServletRequest httpRequest = new MockHttpServletRequest();
		((MockHttpServletRequest) httpRequest).setRequestURI("/olat");
		HttpServletResponse httpResponse = mock(HttpServletResponse.class);

		UserRequestImpl userRequest = new UserRequestImpl("/olat", httpRequest, httpResponse);
		WindowControl windowControl = new WindowControlMocker();
		LmsuzhTranslator translator = new LmsuzhTranslator();

		configTabController = new ConfigurationTabController(userRequest, windowControl, translator);
	}


	// test if configuration tab is in panel
	// test if event is fired

	@Test
	public void event_controller() {
		UserRequest userRequest = mock(UserRequest.class);
		Controller source = mock(Controller.class);
		Event event = mock(Event.class);
		configTabController.event(userRequest, source, event);
		assertTrue(true);
	}

	@Test
	public void event_component() {
		UserRequest userRequest = mock(UserRequest.class);
		Component source = mock(Component.class);
		Event event = mock(Event.class);
		configTabController.event(userRequest, source, event);
		assertTrue(true);
	}

	@Test
	public void doDispose() {
		configTabController.doDispose();
		assertTrue(true);
	}
}
