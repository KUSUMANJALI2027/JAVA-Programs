class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Experiment4_5 {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible for voting");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // Invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}