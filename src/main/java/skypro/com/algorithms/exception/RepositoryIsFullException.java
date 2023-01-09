package skypro.com.algorithms.exception;

public class RepositoryIsFullException extends RuntimeException {

    public RepositoryIsFullException() {
    }

    public RepositoryIsFullException(String message) {
        super(message);
    }

    public RepositoryIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryIsFullException(Throwable cause) {
        super(cause);
    }

    public RepositoryIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
