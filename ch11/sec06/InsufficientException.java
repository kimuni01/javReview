package ch11.sec06;

public class InsufficientException extends Exception { // declared as a normal exception
    public InsufficientException() {

    }

    public InsufficientException(String message) {
        super(message);
    }
}
