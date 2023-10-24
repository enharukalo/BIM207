class Language {
    private final String name;
    private final String code;
    private final String greeting;

    // Constructor
    public Language(String name, String code, String greeting) {
        this.name = name;
        this.code = code;
        this.greeting = greeting;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }
}
