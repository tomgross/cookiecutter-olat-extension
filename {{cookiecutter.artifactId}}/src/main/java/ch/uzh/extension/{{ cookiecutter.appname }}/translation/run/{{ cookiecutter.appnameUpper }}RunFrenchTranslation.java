package ch.uzh.extension.{{ cookiecutter.appname }}.translation.language.run;

import ch.uzh.extension.olatreplacement.translator.translation.FrenchTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.{{ cookiecutter.appnameUpper }}TranslationKeyPrefix;

/**
 */
public class {{ cookiecutter.appnameUpper }}RunFrenchTranslation extends FrenchTranslation {

	public {{ cookiecutter.appnameUpper }}RunFrenchTranslation(String courseNodeName) {
		super({{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class,
			new String[]{"save", "Sauvegarder"},
			new String[]{"reset", "Réinitialiser"},
			new String[]{"cancel", "Annuler"},
			new String[]{"back", "Retour"}
		);
	}
}
