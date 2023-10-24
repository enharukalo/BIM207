import java.util.ArrayList;
import java.util.List;

public class HelloWorldApp {
    public static void main(String[] args) {
        // Create a list of languages with their names, codes, and greeting messages
        List<Language> languages = new ArrayList<>();
        languages.add(new Language("English", "en", "Hello World!"));
        languages.add(new Language("German", "de", "Hallo Welt!"));
        languages.add(new Language("Spanish", "es", "¡Hola Mundo!"));
        languages.add(new Language("French", "fr", "Bonjour le monde!"));
        languages.add(new Language("Italian", "it", "Ciao mondo!"));
        languages.add(new Language("Russian", "ru", "Привет мир!"));
        languages.add(new Language("Turkish", "tr", "Merhaba Dünya!"));

        LanguageSelector languageSelector = new LanguageSelector(languages);
        languageSelector.selectLanguage();
    }
}
