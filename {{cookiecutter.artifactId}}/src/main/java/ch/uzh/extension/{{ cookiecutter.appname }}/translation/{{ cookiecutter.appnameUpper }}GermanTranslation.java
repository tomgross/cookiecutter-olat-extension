package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.translation.GermanTranslation;

/*
 */
public class {{ cookiecutter.appnameUpper }}GermanTranslation extends GermanTranslation {

	public {{ cookiecutter.appnameUpper }}GermanTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			TransUtil.t("course.node.title", courseNodeName),
			TransUtil.t("pane.tab.configuration", "Konfiguration"),
			TransUtil.t("save", "Speichern"),
			TransUtil.t("reset", "Zurücksetzen"),
			TransUtil.t("cancel", "Abbrechen"),
			TransUtil.t("back", "Zurück")
		);
	}
}
