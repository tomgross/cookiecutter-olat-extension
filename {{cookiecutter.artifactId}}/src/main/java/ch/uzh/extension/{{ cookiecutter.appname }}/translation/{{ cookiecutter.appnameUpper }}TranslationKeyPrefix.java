package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.translation.TranslationKeyPrefix;
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
		super(new {{ cookiecutter.appnameUpper }}EnglishTranslation(courseNodeName),
				new {{ cookiecutter.appnameUpper }}FrenchTranslation(courseNodeName),
				new {{ cookiecutter.appnameUpper }}GermanTranslation(courseNodeName),
				new {{ cookiecutter.appnameUpper }}ItalianTranslation(courseNodeName));
	}
}
