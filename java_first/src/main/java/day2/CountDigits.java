package day2;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) count = 1;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
