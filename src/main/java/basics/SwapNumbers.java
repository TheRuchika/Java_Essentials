package basics;

/**
 * Demonstrates different ways to swap two numbers in Java.
 *
 * Approaches:
 * 1. Using a third variable
 * 2. Using addition and subtraction (without third variable)
 * 3. Using multiplication and division (without third variable)
 */
public class SwapNumbers {

    public static void main(String[] args) {

        // ----------- Method 1: Using a third variable -----------

        int a = 10;
        int b = 20;

        System.out.println("Before swapping values: " + a + " " + b);

        // Store value of 'a' in temporary variable
        int c = a;
        a = b;
        b = c;

        System.out.println("Swapped values: " + a + " " + b);

        System.out.println();
        System.out.println();

        // ----------- Method 2: Using + and - (without third variable) -----------

        int d = 10;
        int e = 20;

        System.out.println("Before swapping values: " + d + " " + e);

        // Add both values and store in 'd'
        d = d + e;   // 10 + 20 = 30

        // Subtract new 'e' value from 'd' to get original 'd'
        e = d - e;   // 30 - 20 = 10

        // Subtract new 'e' value from 'd' to get original 'e'
        d = d - e;   // 30 - 10 = 20

        System.out.println("Swapped values: " + d + " " + e);

        System.out.println();
        System.out.println();

        // ----------- Method 3: Using * and / (without third variable) -----------

        int x = 10;
        int y = 20;

        System.out.println("Before swapping values: " + x + " " + y);

        // Multiply both values and store in 'x'
        x = x * y;   // 10 * 20 = 200

        // Divide to get original 'x'
        y = x / y;   // 200 / 20 = 10

        // Divide to get original 'y'
        x = x / y;   // 200 / 10 = 20

        System.out.println("Swapped values: " + x + " " + y);
    }
}
