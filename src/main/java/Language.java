class Language {
    private final String name;
    private final String code;
    private final String greeting;

    public Language(String name, String code, String greeting) {
        this.name = name;
        this.code = code;
        this.greeting = greeting;
    }

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
