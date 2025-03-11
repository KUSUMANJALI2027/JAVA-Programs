import java.io.*;

public class Experiment4_7 {
    public static void main(String[] args) {
        // Writing to a file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bufferedExample.txt"))) {
            writer.write("Hello, this is a test file.\n");
            writer.write("Writing data to a file using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("bufferedExample.txt"))) {
            String line;
            System.out.println("\nData read from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}