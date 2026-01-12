package basics;

/**
 * Counts the number of occurrences of a specific character in a string.
 *
 * Demonstrates two approaches:
 * 1. Using iteration
 * 2. Without iteration (using replace)
 */
public class CountLetterCountInAString {

    public static void main(String[] args) {

        // ----------- Approach 1: Using iteration -----------

        String input = "RuchikAAaa Pramodya";
        char toFind = 'a';

        // Convert string to lowercase to handle case-insensitive comparison
        input = input.toLowerCase();

        int count = 0;

        // Convert string to character array
        char[] charInput = input.toCharArray();

        // Loop through characters and count matches
        for (int i = 0; i < charInput.length; i++) {
            if (charInput[i] == toFind) {
                count++;
            }
        }

        System.out.println("Count using iteration: " + count);

        // ----------- Approach 2: Without using iteration -----------

        // Convert string to uppercase for uniform comparison
        input = input.toUpperCase();

        // Convert character to string and uppercase it
        String charToFind = Character.toString(toFind).toUpperCase();

        // Store original length
        int actualLength = input.length();

        // Remove all occurrences of the character
        input = input.replace(charToFind, "");

        // Length after removal
        int lengthAfterReplace = input.length();

        // Difference gives number of occurrences
        int letterCount = actualLength - lengthAfterReplace;

        System.out.println("Count without iteration: " + letterCount);
    }
}
