package model;
public class Feedback extends BaseEntity {
    private String author;
    private String message;
    public Feedback(String author, String message) {
        this.author = author;
        this.message = message;
    }
    public String getAuthor() {
        return author;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String display() {
        return author + ": " + message;
    }
    public String toCSV() {
        return author + "," + message;
    }
    public static Feedback fromCSV(String line) {
        String[] parts = line.split(",");
        return new Feedback(parts[0], parts[1]);
    }
}
