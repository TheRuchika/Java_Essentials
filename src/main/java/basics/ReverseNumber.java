package basics;

import java.util.Scanner;

/**
 * Reverses a number using two different approaches:
 * 1. Mathematical logic
 * 2. StringBuffer reverse method
 */
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ----------- Method 1: Using mathematical logic -----------

        System.out.println("Input number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        // Loop runs until the number becomes 0
        while (number != 0) {
            // Get last digit and add it to reversed number
            reversedNumber = reversedNumber * 10 + number % 10;

            // Remove last digit from the original number
            number = number / 10;
        }

        System.out.println("Reversed number (logic): " + reversedNumber);

        System.out.println();
        System.out.println();

        // ----------- Method 2: Using StringBuffer -----------

        System.out.println("Input number: ");
        int number2 = scanner.nextInt();

        // Convert number to StringBuffer and reverse it
        StringBuffer sb = new StringBuffer(String.valueOf(number2));
        StringBuffer reversedBuffer = sb.reverse();

        System.out.println("Reversed number (StringBuffer): " + reversedBuffer);
    }
}
