package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}TestCase;
import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNodeConfiguration;
import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import org.junit.Before;
import org.junit.Test;
import org.olat.core.CoreSpringFactory;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.UserRequestImpl;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.util.WindowControlMocker;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


@SuppressWarnings("initialization.fields.uninitialized")
public class IT{{ cookiecutter.appnameUpper }}NodeRunControllerTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private {{ cookiecutter.appnameUpper }}NodeRunController runController;

	@Before
	public void createRunController() {
		HttpServletRequest httpRequest = new MockHttpServletRequest();
		((MockHttpServletRequest) httpRequest).setRequestURI("/olat");
		HttpServletResponse httpResponse = mock(HttpServletResponse.class);

		UserRequestImpl userRequest = new UserRequestImpl("/olat", httpRequest, httpResponse);
		WindowControl windowControl = new WindowControlMocker();
		LmsuzhTranslator translator = new LmsuzhTranslator();

		{{ cookiecutter.appnameUpper }}CourseNodeConfiguration courseNodeConfig = ({{ cookiecutter.appnameUpper }}CourseNodeConfiguration) CoreSpringFactory.getBean(
			"{{ cookiecutter.appname }}CourseNodeConfiguration");
		{{ cookiecutter.appnameUpper }}CourseNode courseNode = ({{ cookiecutter.appnameUpper }}CourseNode) courseNodeConfig.getInstance();

		runController = new {{ cookiecutter.appnameUpper }}NodeRunController(userRequest, windowControl, courseNode, translator);
	}

	@Test
	public void activate() {
		assertTrue(true);
	}

	@Test
	public void event() {
		UserRequest userRequest = mock(UserRequest.class);
		Component source = mock(Component.class);
		Event event = mock(Event.class);
		runController.event(userRequest, source, event);
		assertTrue(true);
	}

	@Test
	public void doDispose() {
		runController.doDispose();
		assertTrue(true);
	}
}
