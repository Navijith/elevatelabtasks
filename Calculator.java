import java.util.Scanner;

public class Calculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println("      JAVA CONSOLE CALCULATOR");
        System.out.println("==================================");

        while (true) {

            System.out.println("\nChoose an Operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("\nThank you for using Calculator!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.print("Enter First Number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter Second Number: ");
            double num2 = sc.nextDouble();

            try {

                switch (choice) {

                    case 1:
                        System.out.println("Result = " + add(num1, num2));
                        break;

                    case 2:
                        System.out.println("Result = " + subtract(num1, num2));
                        break;

                    case 3:
                        System.out.println("Result = " + multiply(num1, num2));
                        break;

                    case 4:
                        System.out.println("Result = " + divide(num1, num2));
                        break;

                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        sc.close();
    }
}