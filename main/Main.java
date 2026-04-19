package main;
import service.FeedbackService;
import model.Feedback;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FeedbackService service = new FeedbackService();
        while (true) {
            System.out.println("\n1 Add Feedback");
            System.out.println("2 View Feedback");
            System.out.println("3 Update Feedback");
            System.out.println("4 Delete Feedback");
            System.out.println("5 Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty.");
                    continue;
                }
                System.out.print("Enter message: ");
                String message = scanner.nextLine();
                service.addFeedback(name, message);
                System.out.println("Feedback added.");
            } else if (choice.equals("2")) {
                ArrayList<Feedback> list = service.getAllFeedback();
                if (list.isEmpty()) {
                    System.out.println("No feedback available.");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + ". " + list.get(i));
                    }
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter index: ");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new message: ");
                String newMessage = scanner.nextLine();
                service.updateFeedback(index, newMessage);
            } else if (choice.equals("4")) {
                System.out.print("Enter index: ");
                int index = Integer.parseInt(scanner.nextLine());
                service.deleteFeedback(index);
            } else if (choice.equals("5")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
