package ch.uzh.extension.{{ cookiecutter.appname }}.translation.run;

import ch.uzh.extension.olatreplacement.translator.translation.EnglishTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;

/*
 */
public class {{ cookiecutter.appnameUpper }}RunEnglishTranslation extends EnglishTranslation {

	public {{ cookiecutter.appnameUpper }}RunEnglishTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			new String[]{"course.node.title", courseNodeName},
			new String[]{"save", "Save"},
			new String[]{"reset", "Reset"},
			new String[]{"cancel", "Cancel"},
			new String[]{"back", "Back"}
		);
	}
}
