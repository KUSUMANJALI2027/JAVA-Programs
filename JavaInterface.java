interface Drawable {
    void draw(); // Abstract method
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle();
        Drawable circle = new Circle();
        
        rectangle.draw(); // Calls Rectangle's draw method
        circle.draw(); // Calls Circle's draw method
    }
}