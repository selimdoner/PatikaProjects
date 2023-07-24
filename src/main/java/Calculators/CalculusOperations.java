package Calculators;

public class CalculusOperations {
    public static double differentiate(double[] coefficients, int degree, double x) {
        if (coefficients.length != degree + 1) {
            throw new IllegalArgumentException("Number of coefficients must be equal to degree + 1.");
        }
        double result = 0;
        for (int i = 0; i <= degree; i++) {
            result += coefficients[i] * Math.pow(x, degree - i);
        }
        return result;
    }

    public static double integrate(double[] coefficients, int degree, double lowerLimit, double upperLimit) {
        if (coefficients.length != degree + 1) {
            throw new IllegalArgumentException("Number of coefficients must be equal to degree + 1.");
        }
        double result = 0;
        for (int i = 0; i <= degree; i++) {
            result += coefficients[i] / (degree - i + 1) * (Math.pow(upperLimit, degree - i + 1) - Math.pow(lowerLimit, degree - i + 1));
        }
        return result;
    }
}
