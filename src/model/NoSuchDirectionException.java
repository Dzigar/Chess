package model;

/**
 *
 * @author dzigar
 */
public class NoSuchDirectionException extends Exception {

    NoSuchDirectionException(String message) {
        super(message);
    }

    NoSuchDirectionException() {
        super();
    }
}
