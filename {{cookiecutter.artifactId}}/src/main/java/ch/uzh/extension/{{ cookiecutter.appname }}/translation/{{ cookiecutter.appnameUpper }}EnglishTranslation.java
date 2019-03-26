package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.translation.EnglishTranslation;

/*
 */
public class {{ cookiecutter.appnameUpper }}EnglishTranslation extends EnglishTranslation {


	public {{ cookiecutter.appnameUpper }}EnglishTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			TransUtil.t("course.node.title", courseNodeName),
			TransUtil.t("pane.tab.configuration", "Configuration"),
			TransUtil.t("save", "Save"),
			TransUtil.t("reset", "Reset"),
			TransUtil.t("cancel", "Cancel"),
			TransUtil.t("back", "Back")
		);
	}
}
