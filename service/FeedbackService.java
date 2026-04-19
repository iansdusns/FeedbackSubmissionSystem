package service;
import model.Feedback;
import util.FileManager;
import java.util.ArrayList;
public class FeedbackService {
    private ArrayList<Feedback> feedbackList;
    public FeedbackService() {
        feedbackList = FileManager.loadFeedbacks();
    }
    public void addFeedback(String author, String message) {
        feedbackList.add(new Feedback(author, message));
        FileManager.saveFeedbacks(feedbackList);
    }
    public ArrayList<Feedback> getAllFeedback() {
        return feedbackList;
    }
    public void updateFeedback(int index, String newMessage) {
        if (index >= 0 && index < feedbackList.size()) {
            feedbackList.get(index).setMessage(newMessage);
            FileManager.saveFeedbacks(feedbackList);
        } else {
            System.out.println("Invalid index.");
        }
    }
    public void deleteFeedback(int index) {
        if (index >= 0 && index < feedbackList.size()) {
            feedbackList.remove(index);
            FileManager.saveFeedbacks(feedbackList);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
