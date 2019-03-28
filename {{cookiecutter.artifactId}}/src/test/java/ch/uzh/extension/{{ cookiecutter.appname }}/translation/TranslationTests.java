package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslatorInternal;
import ch.uzh.extension.olatreplacement.translator.translation.Translation;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


public class TranslationTests {

	@Test
	public void t() {
		assertArrayEquals(
			TransUtil.t("save", "Save"),
			new String[] {"save", "Save"}
		);
	}

	@Test
	public void testEnglish() {
		{{ cookiecutter.appnameUpper }}EnglishTranslation trans = new {{ cookiecutter.appnameUpper }}EnglishTranslation("junit");
		assertTrue(trans.getKeyValuePairs().containsValue("junit"));
	}

	@Test
	public void testFrench() {
		{{ cookiecutter.appnameUpper }}FrenchTranslation trans = new {{ cookiecutter.appnameUpper }}FrenchTranslation("junit");
		assertTrue(trans.getKeyValuePairs().containsValue("junit"));
	}

	@Test
	public void testGerman() {
		{{ cookiecutter.appnameUpper }}GermanTranslation trans = new {{ cookiecutter.appnameUpper }}GermanTranslation("junit");
		assertTrue(trans.getKeyValuePairs().containsValue("junit"));
	}

	@Test
	public void testItalian() {
		{{ cookiecutter.appnameUpper }}ItalianTranslation trans = new {{ cookiecutter.appnameUpper }}ItalianTranslation("junit");
		assertTrue(trans.getKeyValuePairs().containsValue("junit"));
	}

	@Test
	public void testFullTranslation() {
		{{ cookiecutter.appnameUpper }}TranslationKeyPrefix trans = new {{ cookiecutter.appnameUpper }}TranslationKeyPrefix();
		Translation english = trans.getInstance(LmsuzhTranslatorInternal.Language.English);
		assertTrue(english.getKeyValuePairs().containsValue("Save"));
	}
}
