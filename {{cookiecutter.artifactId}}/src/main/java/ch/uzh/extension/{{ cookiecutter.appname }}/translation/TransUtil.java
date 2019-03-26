package ch.uzh.extension.{{ cookiecutter.appname }}.translation;

public class TransUtil {

    private TransUtil() {
        throw new IllegalStateException("Translation utility class");
    }

    public static String[] t(String key, String label) {
        return new String[]{key, label};
    }


}