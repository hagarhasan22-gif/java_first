import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (num1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number (num2): ");
        int num2 = sc.nextInt();

        //Arithmetic Operations:

        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Remainder (num1 % num2) = " + (num1 % num2));


        // If Conditions:
        System.out.println("\n--- If Conditions ---");

        if (num1 > num2) {
            System.out.println("num1 is greater");
        } else if (num2 > num1) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

        if (num1 == num2) {
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The two numbers are not equal");
        }

        //Logical Operators:
        System.out.println("\n--- Logical Operators ---");

        if (num1 > 0 && num2 > 0) {
            System.out.println("Both are positive");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("One is positive");
        } else {
            System.out.println("No positives");
        }


        //Trenary Operator
        System.out.println("\n--- Ternary Operator ---");

        String greater =
                (num1 > num2) ? "num1 is greater" :
                        (num2 > num1) ? "num2 is greater" :
                                "Both are equal";
        System.out.println(greater);

        String evenOdd =
                (num1 % 2 == 0) ? "num1 is Even" : "num1 is Odd";
        System.out.println(evenOdd);

        sc.close();
    }
}
