package ch.uzh.extension.h5p;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import ch.uzh.extension.olatreplacement.translator.translation.TranslationKeyPrefix;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.olat.core.gui.translator.Translator;
import org.olat.test.KeyTranslator;

import java.util.Locale;

import static ch.uzh.extension.olatreplacement.translator.LmsuzhTranslatorInternal.Language;


/**

 */

public class NoopLmsuzhTranslator extends LmsuzhTranslator {

	public NoopLmsuzhTranslator() {}

	private Language getLanguage() {
		return Language.English;
	}

	public String translate(Class<? extends TranslationKeyPrefix> keyPrefix, String key) {
		return key;
	}

	public String translate(@Nullable Translator fallbackTranslator, Class<? extends TranslationKeyPrefix> keyPrefix, String key) {
		return key;
	}

	public String translate(Class<? extends TranslationKeyPrefix> keyPrefix, String key, String... args) {
		return key;
	}

	public String translate(@Nullable Translator fallbackTranslator, Class<? extends TranslationKeyPrefix> keyPrefix, String key, String... args) {
		return key;
	}

	public Translator getLegacyTranslator(Class<? extends TranslationKeyPrefix> keyPrefix) {
		return new KeyTranslator(Locale.ENGLISH);
	}

	public Translator getLegacyTranslator(Class<? extends TranslationKeyPrefix> keyPrefix, @Nullable Translator fallbackTranslator) {
		return new KeyTranslator(Locale.ENGLISH);
	}
}
