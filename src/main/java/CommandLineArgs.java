import com.beust.jcommander.Parameter;

public class CommandLineArgs {
    // Define the command line arguments
    @Parameter(names = {"-l", "--lang", "--language"}, description = "Choose a language (en, de, es, fr, it, ru, tr)", required = true)
    String languageCode;
}