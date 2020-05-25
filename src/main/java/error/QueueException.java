package error;

public class QueueException extends RuntimeException {

    public QueueException() {
        super();
    }

    public QueueException(String name) {
        super(name);
    }
}
