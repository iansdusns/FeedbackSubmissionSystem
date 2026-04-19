package main;
import model.Feedback;
import service.FeedbackService;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FeedbackService service = new FeedbackService();
        while (true) {
            System.out.println("1. Add Feedback");
            System.out.println("2. View Feedback");
            System.out.println("3. Update Feedback");
            System.out.println("4. Delete Feedback");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty!");
                    continue;
                }
                System.out.print("Enter message: ");
                String message = scanner.nextLine();
                if (message.isEmpty()) {
                    System.out.println("Message cannot be empty!");
                    continue;
                }
                service.addFeedback(new Feedback(name, message));
                System.out.println("Feedback added!");
            }
            else if (choice.equals("2")) {
                service.viewFeedback();

            }
            else if (choice.equals("3")) {
                System.out.print("Enter index to update: ");
                int index;
                try {
                    index = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Invalid number!");
                    continue;
                }
                System.out.print("Enter new message: ");
                String newMessage = scanner.nextLine();
                if (newMessage.isEmpty()) {
                    System.out.println("Message cannot be empty!");
                    continue;
                }
                service.updateFeedback(index, newMessage);

            }
            else if (choice.equals("4")) {
                System.out.print("Enter index to delete: ");
                int index;
                try {
                    index = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Invalid number!");
                    continue;
                }
                service.deleteFeedback(index);
            }
            else if (choice.equals("5")) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
