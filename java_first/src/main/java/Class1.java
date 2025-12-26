
//
//public class Class1 {
//    public static void main(String[] args) {
////        System.out.println("Hello");
////
////        String fullName = "Hagar Alaa";
////        int age = 27;
////        String dateOfBirth = "15/06/1990";
////        String job = "Eng";
////        double income = 5000;
////
////        System.out.printf("My name is %s, my age is: %d, my date of birth is: %s, my job is: %s, my income is: %.2f EGP%n",
////                fullName, age, dateOfBirth, job, income);
////        System.out.println("..............");
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter a number: ");
////        int number = scanner.nextInt();
////        String res="";
////        if (number > 0) {
////            res="positive";
////        } else if (number < 0) {
////            res="negative";
////        } else {
////            res="zero";
////        }
////
////        // Program to check positive, negative or zero
////        System.out.println("The number is " + res);
//
//
//        Scanner scanner = new Scanner(System.in);
//
////        System.out.print("Enter day name: ");
////        String day_name = scanner.nextLine();
//
////        switch (day_name) {
////            case "Sunday":
////                System.out.println("1");
////                break;
////            case "Monday":
////                System.out.println("2");
////                break;
////            case "Tuesday":
////                System.out.println("3");
////                break;
////            case "Wedensday":
////                System.out.println("4");
////                break;
////            case "Thursday":
////                System.out.println("5");
////                break;
////            case "Friday":
////                System.out.println("6");
////                break;
////            case "Saturday":
////                System.out.println("7");
////                break;
//
////        }
//    }
//}
import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        System.out.print("Enter third number: ");
        double c = input.nextDouble();
        if (a < b && a < c) {
            System.out.println("Smallest number is: " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }
        input.close();
    }
}

