package Calculators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Square Root");
        System.out.println("7. Differentiation");
        System.out.println("8. Integration");
        System.out.println("9. Factorial Calculation");
        System.out.println("10. Modulus");
        System.out.println("11. Absolute Value Calculation");
        System.out.println("0. Exit");
        System.out.println("---------------------");

        while (true) {
            System.out.print("Select an operation (0-11): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            double result = 0;
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number for addition: ");
                    double addend1 = scanner.nextDouble();
                    System.out.print("Enter the second number for addition: ");
                    double addend2 = scanner.nextDouble();
                    result = MathOperations.add(addend1, addend2);
                    break;
                case 2:
                    System.out.print("Enter the first number for subtraction: ");
                    double minuend = scanner.nextDouble();
                    System.out.print("Enter the second number for subtraction: ");
                    double subtrahend = scanner.nextDouble();
                    result = MathOperations.subtract(minuend, subtrahend);
                    break;
                case 3:
                    System.out.print("Enter the first number for multiplication: ");
                    double multiplier1 = scanner.nextDouble();
                    System.out.print("Enter the second number for multiplication: ");
                    double multiplier2 = scanner.nextDouble();
                    result = MathOperations.multiply(multiplier1, multiplier2);
                    break;
                case 4:
                    System.out.print("Enter the dividend: ");
                    double dividend = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    double divisor = scanner.nextDouble();
                    result = MathOperations.divide(dividend, divisor);
                    break;
                case 5:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = MathOperations.power(base, exponent);
                    break;
                case 6:
                    System.out.print("Enter the number to calculate square root: ");
                    double number = scanner.nextDouble();
                    result = MathOperations.squareRoot(number);
                    break;
                case 7:
                    System.out.print("Enter the degree of the equation for differentiation: ");
                    int degree = scanner.nextInt();
                    double[] coefficients = new double[degree + 1];
                    System.out.println("Enter the coefficients of the equation in order:");
                    for (int i = 0; i <= degree; i++) {
                        System.out.print("Coefficient for x^" + (degree - i) + ": ");
                        coefficients[i] = scanner.nextDouble();
                    }
                    System.out.print("Enter the value of x for differentiation: ");
                    double xValue = scanner.nextDouble();
                    result = CalculusOperations.differentiate(coefficients, degree, xValue);
                    break;
                case 8:
                    System.out.print("Enter the degree of the equation for integration: ");
                    int degreeInt = scanner.nextInt();
                    double[] coefficientsInt = new double[degreeInt + 1];
                    System.out.println("Enter the coefficients of the equation in order:");
                    for (int i = 0; i <= degreeInt; i++) {
                        System.out.print("Coefficient for x^" + (degreeInt - i) + ": ");
                        coefficientsInt[i] = scanner.nextDouble();
                    }
                    System.out.print("Enter the lower limit of integration: ");
                    double lowerLimit = scanner.nextDouble();
                    System.out.print("Enter the upper limit of integration: ");
                    double upperLimit = scanner.nextDouble();
                    result = CalculusOperations.integrate(coefficientsInt, degreeInt, lowerLimit, upperLimit);
                    break;
                case 9:
                    System.out.print("Enter a non-negative integer to calculate factorial: ");
                    int n = scanner.nextInt();
                    result = MathOperations.factorial(n);
                    break;
                case 10:
                    System.out.print("Enter the first number for modulus calculation: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number for modulus calculation: ");
                    double num2 = scanner.nextDouble();
                    result = MathOperations.modulus(num1, num2);
                    break;
                case 11:
                    System.out.print("Enter the number to calculate absolute value: ");
                    double absoluteValue = scanner.nextDouble();
                    result = MathOperations.absoluteValue(absoluteValue);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println("---------------------");
        }

        scanner.close();
    }
}
