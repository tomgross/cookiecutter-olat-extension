package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.controller.BasicController;
import org.olat.core.gui.control.generic.dtabs.Activateable2;
import org.olat.core.id.context.ContextEntry;
import org.olat.core.id.context.StateEntry;
import org.olat.course.nodes.TitledWrapperHelper;
import org.olat.util.logging.activity.LoggingResourceable;

import java.util.List;

/**
 */
public class {{ cookiecutter.appnameUpper }}NodeRunController extends BasicController implements Activateable2 {

    private {{ cookiecutter.appnameUpper }}Controller {{ cookiecutter.appname }}Controller;

    public {{ cookiecutter.appnameUpper }}NodeRunController(UserRequest userRequest, WindowControl windowControl, {{ cookiecutter.appnameUpper }}CourseNode courseNode, LmsuzhTranslator translator) {
        super(userRequest, windowControl, translator.getLegacyTranslator({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.prefix));

        // set logger on this run controller
        addLoggingResourceable(LoggingResourceable.wrap(courseNode));

        {{ cookiecutter.appname }}Controller = new {{ cookiecutter.appnameUpper }}Controller(userRequest, windowControl, translator);
        listenTo({{ cookiecutter.appname }}Controller);
        Controller titledCtrl = TitledWrapperHelper.getWrapper(userRequest, windowControl, {{ cookiecutter.appname }}Controller, courseNode, "o_podcast_icon");
        listenTo(titledCtrl);
        putInitialPanel(titledCtrl.getInitialComponent());
    }

    @Override
    public void activate(UserRequest userRequest, List<ContextEntry> entries, StateEntry state) {
        {{ cookiecutter.appname }}Controller.activate(userRequest, entries, state);
    }

    @Override
    protected void event(UserRequest ureq, Component source, Event event) {
        // Nothing to do here
    }

    @Override
    protected void doDispose() {
        // Nothing to do here
    }

}
