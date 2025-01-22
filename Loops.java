public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        // For loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("While Loop:");
        // While loop to print numbers from 1 to 5
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        System.out.println("Do-While Loop:");
        // Do-while loop to print numbers from 1 to 5
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}