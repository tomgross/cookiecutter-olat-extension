package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;
import org.checkerframework.checker.initialization.qual.UnderInitialization;
import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.form.flexible.FormItem;
import org.olat.core.gui.components.form.flexible.FormItemContainer;
import org.olat.core.gui.components.form.flexible.impl.FormBasicController;
import org.olat.core.gui.components.form.flexible.impl.FormEvent;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.WindowControl;


/**
 */
@SuppressWarnings("initialization.fields.uninitialized")
public class ConfigFormController extends FormBasicController {

	ConfigFormController(UserRequest userRequest, WindowControl windowControl, LmsuzhTranslator translator) {
		super(userRequest, windowControl, translator.getLegacyTranslator({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.prefix));
	}

	@Override
	protected void initForm(@UnderInitialization ConfigFormController this, FormItemContainer formLayout, @UnknownInitialization Controller listener, UserRequest ureq) {
		// not implemented yet
	}

	@Override
	protected void formInnerEvent(UserRequest userRequest, FormItem source, FormEvent event) {
		// not implemented yet
	}

	@Override
	protected void formOK(UserRequest ureq) {
		// not implemented yet
	}

	@Override
	protected void doDispose() {
		// not implemented yet
	}

}
