package basics;

import java.util.Scanner;

/**
 * Finds the position of an English alphabet (a–z).
 *
 * Example:
 * Input  : a
 * Output : 1
 *
 * Input  : z
 * Output : 26
 *
 * This program uses ASCII values to calculate the position.
 */
public class FindAlphabetPosition {

    public static void main(String[] args) {

        // Create Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert English letter: ");

        // Read first character from input
        char letter = scanner.next().charAt(0);

        // Convert letter to lowercase to handle uppercase inputs
        letter = Character.toLowerCase(letter);

        // Get ASCII value of the character
        int asciiValue = (int) letter;
        System.out.println("ASCII value: " + asciiValue);

        // Calculate alphabet position (a = 97, so subtract 96)
        int position = asciiValue - 96;
        System.out.println("Alphabet position: " + position);
    }
}
