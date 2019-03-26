package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.translation.ItalianTranslation;

/**
 */
public class {{ cookiecutter.appnameUpper }}ItalianTranslation extends ItalianTranslation {

	public {{ cookiecutter.appnameUpper }}ItalianTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			TransUtil.t("course.node.title", courseNodeName),
			TransUtil.t("pane.tab.configuration", "Configurazione"),
			TransUtil.t("save", "Salvare"),
			TransUtil.t("reset", "Resettare"),
			TransUtil.t("cancel", "Annullare"),
			TransUtil.t("back", "Indietro")
		);
	}
}
