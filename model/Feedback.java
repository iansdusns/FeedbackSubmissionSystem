package model;
public class Feedback {
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
    public String toString() {
        return author + ": " + message;
    }
}
