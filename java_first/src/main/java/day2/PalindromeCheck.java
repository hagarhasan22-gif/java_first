package day2;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;
        int n = Math.abs(number);
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        if (Math.abs(original) == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
