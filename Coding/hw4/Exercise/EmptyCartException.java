package Exercise;

public class EmptyCartException extends RuntimeException{

    public EmptyCartException(String message) {
        super(message);
    }
}