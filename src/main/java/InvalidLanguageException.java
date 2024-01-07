// Exception for invalid language codes

public class InvalidLanguageException extends RuntimeException {
    public InvalidLanguageException(String message) {
        super(message);
    }
}
