import java.io.*;

public class Experiment4_6 {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, this is a test file.\n");
            writer.write("Writing data to a file using FileWriter.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            System.out.println("Data read from the file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}