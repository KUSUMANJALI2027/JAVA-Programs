public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Display various string operations
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Replaced String: " + str.replace("World", "Java"));
        System.out.println("Contains 'Hello': " + str.contains("Hello"));
    }
}