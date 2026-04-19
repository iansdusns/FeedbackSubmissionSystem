package util;
import model.Feedback;
import java.io.*;
import java.util.ArrayList;
public class FileManager {
    private static final String FILE_NAME = "data/feedback.csv";
    public static ArrayList<Feedback> loadFeedbacks() {
        ArrayList<Feedback> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    list.add(new Feedback(parts[0], parts[1]));
                }
            }
            reader.close();
        } catch (IOException e) {
            // file may not exist yet
        }
        return list;
    }
    public static void saveFeedbacks(ArrayList<Feedback> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
            for (Feedback f : list) {
                writer.write(f.getAuthor() + "," + f.getMessage());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
