class Car {
    String model;
    int year;

    // Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Create car objects
        Car car1 = new Car("BMW", 2024);
        Car car2 = new Car("Honda", 2026);

        // Display car information
        car1.display();
        car2.display();
    }
}