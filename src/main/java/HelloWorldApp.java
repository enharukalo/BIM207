import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

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

        // Parse the command line arguments
        CommandLineArgs cmdLineArgs = new CommandLineArgs();
        JCommander cmd = JCommander.newBuilder()
                .addObject(cmdLineArgs)
                .programName("HelloWorldApp")
                .build();

        // Display the greeting message
        try {
            cmd.parse(args);
            if (cmdLineArgs.languageCode != null) {
                String greeting = languageSelector.selectLanguage(cmdLineArgs.languageCode);
                System.out.println(greeting);
            } else {
                cmd.usage();
            }
        } catch (ParameterException e) {
            System.err.println(e.getMessage());
            cmd.usage();
        } catch (InvalidLanguageException e) {
            System.err.println(e.getMessage());
        }
    }
}
