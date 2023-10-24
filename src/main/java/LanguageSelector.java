import java.util.List;
import java.util.stream.Collectors;

public class LanguageSelector {
    private final List<Language> languages;

    // Constructor
    public LanguageSelector(List<Language> languages) {
        this.languages = languages;
    }

    // Return the greeting message for the selected language
    public String selectLanguage(String selectedLanguageCode) {
        for (Language language : languages) {
            if (language.getCode().equals(selectedLanguageCode)) {
                return language.getGreeting();
            }
        }
        throw new InvalidLanguageException("Error: Invalid language. " + listLanguages());

    }

    // Return a comma-separated list of language codes
    public String listLanguages() {
        String languageCodes = languages.stream().map(Language::getCode).collect(Collectors.joining(", "));
        return "Supported languages are: " + languageCodes;
    }
}
