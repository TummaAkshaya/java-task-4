/**
 * Modular Calculator Application
 * Demonstrates method design, method overloading,
 * pass-by-value, return values, and exception handling.
 */
public class ModularCalculator {

    public static void main(String[] args) {

        // Testing basic operations
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(4, 2));

        // Testing division with exception handling
        try {
            System.out.println("Division: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Method overloading examples
        System.out.println("Overloaded Add (3 integers): " + add(1, 2, 3));
        System.out.println("Overloaded Add (double): " + add(2.5, 3.5));

        // Pass-by-value demonstration
        int number = 50;
        changeValue(number);
        System.out.println("Value after method call: " + number);
    }

    /**
     * Adds two integers
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * Overloaded add method (three integers)
     */
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Overloaded add method (double values)
     */
    static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts two integers
     */
    static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers
     */
    static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers
     * Throws exception if divisor is zero
     */
    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Demonstrates pass-by-value in Java
     */
    static void changeValue(int x) {
        x = 100;
    }
}
