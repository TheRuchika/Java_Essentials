package basics;

import java.util.Scanner;

/**
 * Prints triangle patterns using:
 * 1. Asterisks (*)
 * 2. Numbers
 */
public class PrintTriangle {

    public static void main(String[] args) {

        // ----------- Triangle using asterisks (*) -----------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row count you want:");

        int numberLines = scanner.nextInt();
        int row, columns;

        // Outer loop controls number of rows
        for (row = 1; row <= numberLines; row++) {

            // Inner loop prints stars for each row
            for (columns = 1; columns <= row; columns++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }

        System.out.println();

        // ----------- Triangle using numbers -----------

        System.out.println("Enter the row count you want:");
        int numbers = scanner.nextInt();
        int number = 1;

        // Outer loop controls rows
        for (row = 0; row < numbers; row++) {

            // Inner loop prints numbers in triangle shape
            for (columns = 0; columns < row; columns++) {
                System.out.print(number + " ");
                number++;
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
