package ch.uzh.extension.{{ cookiecutter.appname }}.presentation.controller;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.Component;
import org.olat.core.gui.components.tabbedpane.TabbedPane;
import org.olat.core.gui.control.Controller;
import org.olat.core.gui.control.ControllerEventListener;
import org.olat.core.gui.control.Event;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.control.generic.tabbable.ActivateableTabbableDefaultController;
import org.olat.course.editor.NodeEditController;

/**
 */
@SuppressWarnings({"initialization.fields.uninitialized"})
public class {{ cookiecutter.appnameUpper }}NodeEditController extends ActivateableTabbableDefaultController implements ControllerEventListener {

    private static final String PANE_TAB_CONFIGURATION = "pane.tab.configuration";
    private static final String[] PANE_KEYS = {PANE_TAB_CONFIGURATION};

    private final ConfigurationTabController configurationTabController;
    private TabbedPane myTabbedPane;

    public {{ cookiecutter.appnameUpper }}NodeEditController(
                                      UserRequest userRequest,
                                      WindowControl windowControl,
                                      LmsuzhTranslator translator) {
        super(userRequest, windowControl, translator.getLegacyTranslator({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.prefix));
		configurationTabController = new ConfigurationTabController(userRequest, windowControl, translator);
		listenTo(configurationTabController);
    }

    @Override
    public void addTabs(TabbedPane tabbedPane) {
        myTabbedPane = tabbedPane;
		tabbedPane.addTab(getTranslator().translate(PANE_TAB_CONFIGURATION), configurationTabController.getInitialComponent());
    }

    @Override
    public String[] getPaneKeys() {
        return PANE_KEYS;
    }

    @Override
    public TabbedPane getTabbedPane() {
        return myTabbedPane;
    }

    @Override
    protected void event(UserRequest ureq, Component source, Event event) {
        // Do nothing here
    }

    @Override
    protected void event(UserRequest ureq, Controller source, Event event) {
		if ((source == configurationTabController) && (event == Event.DONE_EVENT)) {
		    fireEvent(ureq, NodeEditController.NODECONFIG_CHANGED_EVENT);
		}
    }

    @Override
    protected void doDispose() {
        // Do nothing here
    }

}
