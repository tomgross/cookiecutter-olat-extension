package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;
import ch.uzh.extension.tool.NullUtil;
import org.checkerframework.checker.initialization.qual.UnknownInitialization;
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
    }

    @Override
    protected void event(UserRequest userRequest, Component source, Event event) {
        // Do nothing here
    }

    @Override
    protected void event(UserRequest userRequest, Controller source, Event event) {
        /*
        switch (event.getCommand()) {
            case "list-events":
                putContent(videoListController);
                break;
            case "play-event":
                PlayEventEvent playEventEvent = (PlayEventEvent) event;
                String identifier = playEventEvent.getIdentifier();
                if (identifier != null) {
                    videoPlayerController.setIdentifier(identifier);
                    videoPlayerController.update();
                    putContent(videoPlayerController);
                }
                break;
        }
        */
    }

    @Override
    protected void doDispose() {
        // Do nothing here
    }

    private void putContent(@UnknownInitialization {{ cookiecutter.appnameUpper }}Controller this, Controller controller) {
        NullUtil.notNullOrFail({{ cookiecutter.appname }}Panel).put("{{ cookiecutter.appname }}", controller.getInitialComponent());
    }

}
