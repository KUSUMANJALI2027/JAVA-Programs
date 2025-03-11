import java.io.*;

public class Experiment4_8 {
    public static void main(String[] args) {
        // Writing to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("binaryExample.dat")) {
            String data = "Hello, this is binary data.";
            byte[] byteArray = data.getBytes();
            fos.write(byteArray);
            System.out.println("Data written to binary file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file using FileInputStream
        try (FileInputStream fis = new FileInputStream("binaryExample.dat")) {
            int data;
            System.out.println("Data read from binary file:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}