package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.translation.TranslationKeyPrefix;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.language.run.{{ cookiecutter.appnameUpper }}RunEnglishTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.language.run.{{ cookiecutter.appnameUpper }}RunFrenchTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.language.run.{{ cookiecutter.appnameUpper }}RunGermanTranslation;
import ch.uzh.extension.{{ cookiecutter.appname }}.translation.language.run.{{ cookiecutter.appnameUpper }}RunItalianTranslation;
import org.springframework.context.annotation.Configuration;

/**
 */
@Configuration
public class {{ cookiecutter.appnameUpper }}TranslationKeyPrefix extends TranslationKeyPrefix {
	public static final Class<{{ cookiecutter.appnameUpper }}TranslationKeyPrefix> prefix =
			{{ cookiecutter.appnameUpper }}TranslationKeyPrefix.class;

	public {{ cookiecutter.appnameUpper }}TranslationKeyPrefix() {
		this("{{ cookiecutter.appnameUpper }}");
	}

	protected {{ cookiecutter.appnameUpper }}TranslationKeyPrefix(String courseNodeName) {
		super(new {{ cookiecutter.appnameUpper }}RunEnglishTranslation(courseNodeName),
				new {{ cookiecutter.appnameUpper }}RunFrenchTranslation(courseNodeName),
				new {{ cookiecutter.appnameUpper }}RunGermanTranslation(courseNodeName),
				new {{ cookiecutter.appnameUpper }}RunItalianTranslation(courseNodeName));
	}
}
