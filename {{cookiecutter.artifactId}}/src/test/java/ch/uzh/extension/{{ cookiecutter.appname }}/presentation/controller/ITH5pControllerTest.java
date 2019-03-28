package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}TestCase;
import ch.uzh.extension.{{ cookiecutter.appname }}.NoopLmsuzhTranslator;
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
public class IT{{ cookiecutter.appnameUpper }}ControllerTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private {{ cookiecutter.appnameUpper }}Controller {{ cookiecutter.appname }}Controller;

	@Before
	public void setUp() {
		HttpServletRequest httpRequest = new MockHttpServletRequest();
		((MockHttpServletRequest) httpRequest).setRequestURI("/olat");
		HttpServletResponse httpResponse = mock(HttpServletResponse.class);

		UserRequestImpl userRequest = new UserRequestImpl("/olat", httpRequest, httpResponse);
		WindowControl windowControl = new WindowControlMocker();
		LmsuzhTranslator translator = new NoopLmsuzhTranslator();

		{{ cookiecutter.appname }}Controller = new {{ cookiecutter.appnameUpper }}Controller(userRequest, windowControl, translator);
	}

	@Test
	public void activate() {
		// {{ cookiecutter.appname }}Controller.activate();
		assertTrue(true);
	}

	@Test
	public void event_controller() {
		UserRequest userRequest = mock(UserRequest.class);
		Controller source = mock(Controller.class);
		Event event = mock(Event.class);
		{{ cookiecutter.appname }}Controller.event(userRequest, source, event);
		assertTrue(true);
	}

	@Test
	public void event_component() {
		UserRequest userRequest = mock(UserRequest.class);
		Component source = mock(Component.class);
		Event event = mock(Event.class);
		{{ cookiecutter.appname }}Controller.event(userRequest, source, event);
		assertTrue(true);
	}

	@Test
	public void doDispose() {
		{{ cookiecutter.appname }}Controller.doDispose();
		assertTrue(true);
	}
}
