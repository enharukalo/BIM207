import com.beust.jcommander.Parameter;

public class CommandLineArgs {
    // Define the command line arguments
    @Parameter(names = {"-l", "--lang", "--language", "/lang"}, description = "Choose a language", required = true)
    String languageCode;

    @Parameter(names = {"-h", "--help", "/?"}, description = "Display this help message", help = true)
    boolean help;
}