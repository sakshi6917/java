import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept the number of elements
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        // Create an array to store integers
        int[] numbers = new int[n];

        // Accept n integers from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print only even numbers
        System.out.println("Even numbers are:");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
