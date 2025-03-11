public class Experiment4_4 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed regardless of exception.");
        }
        System.out.println("Program continues after exception handling.");
    }
}