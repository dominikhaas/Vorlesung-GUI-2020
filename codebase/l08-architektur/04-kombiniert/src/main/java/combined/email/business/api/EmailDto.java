package combined.email.business.api;

public class EmailDto {
    private String to;
    private String message;

    public EmailDto(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "EmailDto{" +
                "to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
