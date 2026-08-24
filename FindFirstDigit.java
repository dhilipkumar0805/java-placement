import java.util.Scanner;

public class FindFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n >= 10) {
            n /= 10;
        }

        System.out.println("First digit = " + n);
    }
}