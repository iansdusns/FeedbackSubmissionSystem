package service;
import model.Feedback;
import util.FileManager;
import java.util.ArrayList;
public class FeedbackService {
    private ArrayList<Feedback> feedbackList;
    public FeedbackService() {
        feedbackList = FileManager.readFromFile();
    }
    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
        FileManager.writeToFile(feedbackList);
    }
    public void viewFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }
        for (int i = 0; i < feedbackList.size(); i++) {
            System.out.println(i + ". " + feedbackList.get(i).display());
        }
    }
    public void updateFeedback(int index, String newMessage) {
        if (index < 0 || index >= feedbackList.size()) {
            System.out.println("Invalid index!");
            return;
        }
        Feedback feedback = feedbackList.get(index);
        feedback.setMessage(newMessage);
        FileManager.writeToFile(feedbackList);
        System.out.println("Feedback updated!");
    }
    public void deleteFeedback(int index) {
        if (index < 0 || index >= feedbackList.size()) {
            System.out.println("Invalid index!");
            return;
        }
        feedbackList.remove(index);
        FileManager.writeToFile(feedbackList);
        System.out.println("Feedback deleted!");
    }
}
