package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.velocity.VelocityContainer;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.controller.BasicController;
import org.olat.core.gui.control.generic.dtabs.Activateable2;
import org.olat.core.id.context.ContextEntry;
import org.olat.core.id.context.StateEntry;

import java.util.List;

/**
 */
public class {{ cookiecutter.appnameUpper }}Controller extends BasicController implements Activateable2 {

    private LmsuzhTranslator translator;
    private VelocityContainer {{ cookiecutter.appname }}Panel;

    protected {{ cookiecutter.appnameUpper }}Controller(UserRequest userRequest, WindowControl windowControl, LmsuzhTranslator translator) {
        super(userRequest, windowControl, translator.getLegacyTranslator({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class));
        this.translator = translator;
        {{ cookiecutter.appname }}Panel = createVelocityContainer("{{ cookiecutter.appname }}");
        putInitialPanel({{ cookiecutter.appname }}Panel);
    }

    @Override
    public void activate(UserRequest userRequest, List<ContextEntry> entries, StateEntry state) {
        // Nothing at the moment
    }

    @Override
    protected void event(UserRequest userRequest, Component source, Event event) {
        // Nothing at the moment
    }

    @Override
    protected void event(UserRequest userRequest, Controller source, Event event) {
        // Nothing at the moment
    }

    @Override
    protected void doDispose() {
        // Nothing at the moment
    }

}
