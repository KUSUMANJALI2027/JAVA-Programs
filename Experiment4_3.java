public class Experiment4_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception in inner try block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception in outer try block: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}