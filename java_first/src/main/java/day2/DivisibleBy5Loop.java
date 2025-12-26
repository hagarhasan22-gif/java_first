package day2;
import java.util.Scanner;

public class DivisibleBy5Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number % 5 != 0);
        System.out.println("Number divisible by 5 entered: " + number);
    }
}
