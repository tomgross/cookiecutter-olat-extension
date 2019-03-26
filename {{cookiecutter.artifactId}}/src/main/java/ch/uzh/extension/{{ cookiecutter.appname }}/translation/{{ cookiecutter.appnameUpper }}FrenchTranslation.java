package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.translation.FrenchTranslation;

/**
 */
public class {{ cookiecutter.appnameUpper }}FrenchTranslation extends FrenchTranslation {

	public {{ cookiecutter.appnameUpper }}FrenchTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			TransUtil.t("course.node.title", courseNodeName),
			TransUtil.t("pane.tab.configuration", "Configuration"),
			TransUtil.t("save", "Sauvegarder"),
			TransUtil.t("reset", "Réinitialiser"),
			TransUtil.t("cancel", "Annuler"),
			TransUtil.t("back", "Retour")
		);
	}
}
