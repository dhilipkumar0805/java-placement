import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Get array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        // Display result
        System.out.println("Sum of all elements = " + sum);

        sc.close();
    }
}