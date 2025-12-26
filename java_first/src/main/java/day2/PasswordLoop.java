package day2;
import java.util.Scanner;

public class PasswordLoop {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "java123";
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();
        } while (!input.equals(CORRECT_PASSWORD));
        System.out.println("Correct password entered!");
    }
}
