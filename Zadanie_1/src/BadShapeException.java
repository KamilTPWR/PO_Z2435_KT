public class BadShapeException extends Throwable {
    private String message;

    public BadShapeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void printMessage() {
        System.out.println("Error: " + message);
    }
}
