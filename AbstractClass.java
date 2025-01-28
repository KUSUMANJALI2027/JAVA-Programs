// Abstract class
abstract class Animal {
    abstract void sound(); // Abstract method
}

// Cat class inheriting from Animal
class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

// Dog class inheriting from Animal
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

// Main class
public class AbstractClass {
    public static void main(String[] args) {
        Animal cat = new Cat(); // Create a Cat object
        Animal dog = new Dog(); // Create a Dog object
        
        cat.sound(); // Calls Cat's sound method
        dog.sound(); // Calls Dog's sound method
    }
}