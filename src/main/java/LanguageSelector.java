import java.util.Arrays;
import java.util.stream.Collectors;

// Class to select the language for the greeting message
public class LanguageSelector {
        // Return the greeting message for the selected language
        public String selectLanguage(String selectedLanguageCode) {
            for (Languages language : Languages.values()) {
                if (language.getCode().equals(selectedLanguageCode)) {
                    return language.getGreeting();
                }
            }
            throw new InvalidLanguageException("Error: Invalid language. " + listLanguages());
        }

    // Return a comma-separated list of language codes
    public String listLanguages() {
        String languageCodes = Arrays.stream(Languages.values()).map(Languages::getCode).collect(Collectors.joining(", "));
        return "Supported languages are: " + languageCodes;
    }
}
