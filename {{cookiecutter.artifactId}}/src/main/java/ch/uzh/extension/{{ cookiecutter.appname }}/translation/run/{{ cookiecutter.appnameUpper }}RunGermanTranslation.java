package ch.uzh.extension.{{ cookiecutter.appname }}.translation.run;

import ch.uzh.extension.olatreplacement.translator.translation.GermanTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;

/*
 */
public class {{ cookiecutter.appnameUpper }}RunGermanTranslation extends GermanTranslation {

	public {{ cookiecutter.appnameUpper }}RunGermanTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			new String[]{"course.node.title", courseNodeName},
			new String[]{"save", "Speichern"},
			new String[]{"reset", "Zurücksetzen"},
			new String[]{"cancel", "Abbrechen"},
			new String[]{"back", "Zurück"}
		);
	}
}
