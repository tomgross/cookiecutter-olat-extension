package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.{{ cookiecutter.appname }}.{{ cookiecutter.appnameUpper }}TestCase;
import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import org.junit.Before;
import org.junit.Test;
import org.olat.core.gui.UserRequestImpl;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.util.WindowControlMocker;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@SuppressWarnings("initialization.fields.uninitialized")
public class ITConfigFormControllerTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private ConfigFormController formController;

	@Before
	public void createForm() {
		HttpServletRequest httpRequest = new MockHttpServletRequest();
		((MockHttpServletRequest) httpRequest).setRequestURI("/olat");
		HttpServletResponse httpResponse = mock(HttpServletResponse.class);

		UserRequestImpl userRequest = new UserRequestImpl("/olat", httpRequest, httpResponse);
		WindowControl windowControl = new WindowControlMocker();
		LmsuzhTranslator translator = new LmsuzhTranslator();

		formController = new ConfigFormController(userRequest, windowControl, translator);
	}

	@Test
	public void initForm() {
		// formController.initForm();
		assertTrue(true);
	}

	@Test
	public void formInnerEvent() {
		// formController.formInnerEvent();
		assertTrue(true);
	}

	@Test
	public void formOK() {
		// formController.formOK();
		assertTrue(true);
	}

	@Test
	public void doDispose() {
		formController.doDispose();
		assertTrue(true);
	}
}
