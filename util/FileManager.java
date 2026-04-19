package util;
import model.Feedback;
import java.io.*;
import java.util.ArrayList;
public class FileManager {
    private static final String FILE_NAME = "feedback.csv";
    public static ArrayList<Feedback> readFromFile() {
        ArrayList<Feedback> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Feedback.fromCSV(line));
            }
        } catch (IOException e) {
            System.out.println("File not found, starting fresh.");
        }
        return list;
    }
    public static void writeToFile(ArrayList<Feedback> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Feedback f : list) {
                bw.write(f.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}