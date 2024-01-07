// This enum contains the languages that the program supports.
// Each language has a code and a greeting message.
// The code is used to select the language.

public enum Languages {
    ENGLISH("en", "Hello World!"),
    GERMAN("de", "Hallo Welt!"),
    SPANISH("es", "¡Hola Mundo!"),
    FRENCH("fr", "Bonjour le monde!"),
    ITALIAN("it", "Ciao mondo!"),
    RUSSIAN("ru", "Privet mir!"),
    TURKISH("tr", "Merhaba Dünya!");

    private final String code;
    private final String greeting;
    Languages(String code, String greeting) {
        this.code = code;
        this.greeting = greeting;
    }

    public String getCode() {
        return code;
    }

    public String getGreeting() {
        return greeting;
    }
}