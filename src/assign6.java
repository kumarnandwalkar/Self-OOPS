// Write a program that reads from the user four integers representing the numerators and denominators of two fractions calculates the results of the two fractions and displays the values of the fractions sum, subtraction, multiplication and division. Display output up to two decimal places.
// Sample Input: Enter the numerator and denominator of the first fraction: 6 4
//Enter the numerator and denominator of the second fraction: 8 5
//Output:  The sum is: 3.10
//The subtraction is: -0.10
//The multiplication is: 2.40
//The division is:0.93
import java.util.Scanner;
import java.util.Scanner;

public class assign6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        int num1 = 0, den1 = 0, num2 = 0, den2 = 0; // Declare the variables outside the loop

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter fractions");
            System.out.println("2. Calculate sum");
            System.out.println("3. Calculate subtraction");
            System.out.println("4. Calculate multiplication");
            System.out.println("5. Calculate division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the numerator and denominator of the first fraction: ");
                    num1 = scanner.nextInt();
                    den1 = scanner.nextInt();

                    System.out.print("Enter the numerator and denominator of the second fraction: ");
                    num2 = scanner.nextInt();
                    den2 = scanner.nextInt();
                    break;
                case 2:
                    double sum = calculateSum(num1, den1, num2, den2);
                    System.out.printf("The sum is: %.2f\n", sum);
                    break;
                case 3:
                    double subtraction = calculateSubtraction(num1, den1, num2, den2);
                    System.out.printf("The subtraction is: %.2f\n", subtraction);
                    break;
                case 4:
                    double multiplication = calculateMultiplication(num1, den1, num2, den2);
                    System.out.printf("The multiplication is: %.2f\n", multiplication);
                    break;
                case 5:
                    double division = calculateDivision(num1, den1, num2, den2);
                    System.out.printf("The division is: %.2f\n", division);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    public static double calculateSum(int num1, int den1, int num2, int den2) {
        double fraction1 = (double) num1 / den1;
        double fraction2 = (double) num2 / den2;
        return fraction1 + fraction2;
    }

    public static double calculateSubtraction(int num1, int den1, int num2, int den2) {
        double fraction1 = (double) num1 / den1;
        double fraction2 = (double) num2 / den2;
        return fraction1 - fraction2;
    }

    public static double calculateMultiplication(int num1, int den1, int num2, int den2) {
        double fraction1 = (double) num1 / den1;
        double fraction2 = (double) num2 / den2;
        return fraction1 * fraction2;
    }

    public static double calculateDivision(int num1, int den1, int num2, int den2) {
        double fraction1 = (double) num1 / den1;
        double fraction2 = (double) num2 / den2;
        return fraction1 / fraction2;
    }
}