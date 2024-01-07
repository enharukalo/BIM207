import com.beust.jcommander.Parameter;

// Define the command line arguments
public class CommandLineArgs {
    @Parameter(names = {"-l", "--lang", "--language", "/lang"}, description = "Choose a language", required = true)
    String languageCode;

    @Parameter(names = {"-h", "--help", "/?"}, description = "Display this help message", help = true)
    boolean help;
}