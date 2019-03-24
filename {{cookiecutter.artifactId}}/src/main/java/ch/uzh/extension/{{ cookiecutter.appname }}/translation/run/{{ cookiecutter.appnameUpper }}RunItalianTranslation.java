package ch.uzh.extension.{{ cookiecutter.appname }}.translation.language.run;

import ch.uzh.extension.olatreplacement.translator.translation.ItalianTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;

/**
 */
public class {{ cookiecutter.appnameUpper }}RunItalianTranslation extends ItalianTranslation {

	public {{ cookiecutter.appnameUpper }}RunItalianTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			new String[]{"save", "Salvare"},
			new String[]{"reset", "Resettare"},
			new String[]{"cancel", "Annullare"},
			new String[]{"back", "Indietro"}
		);
	}
}
