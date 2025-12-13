import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        String fullName = "Hagar Alaa";
//        int age = 27;
//        String dateOfBirth = "15/06/1990";
//        String job = "Eng";
//        double income = 5000;
//
//        System.out.printf("My name is %s, my age is: %d, my date of birth is: %s, my job is: %s, my income is: %.2f EGP%n",
//                fullName, age, dateOfBirth, job, income);
//        System.out.println("..............");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Program to check positive, negative or zero
        System.out.println("The number is " + checkNumber(number));

    }

    private static String checkNumber(int n) {
        if (n > 0) {
            return "positive";
        } else if (n < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}
