package basics;

/**
 * Counts vowels in a given string.
 *
 * This program:
 * 1. Counts each vowel separately (a, e, i, o, u)
 * 2. Counts total number of vowels together
 */
public class VowelCountInAString {

    public static void main(String[] args) {

        String input = "Javaa Essentials OOOOOOO uUUU";

        // Counters for each vowel
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        // Convert string to lowercase to handle uppercase vowels
        input = input.toLowerCase();

        // ----------- Count each vowel separately -----------

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch == 'a') {
                countA++;
            } else if (ch == 'e') {
                countE++;
            } else if (ch == 'i') {
                countI++;
            } else if (ch == 'o') {
                countO++;
            } else if (ch == 'u') {
                countU++;
            }
        }

        System.out.println("A count is: " + countA);
        System.out.println("E count is: " + countE);
        System.out.println("I count is: " + countI);
        System.out.println("O count is: " + countO);
        System.out.println("U count is: " + countU);

        System.out.println();
        System.out.println();

        // ----------- Count total vowels together -----------

        int totalVowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is any vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                totalVowelCount++;
            }
        }

        System.out.println("Total vowels in the sentence: " + totalVowelCount);
    }
}
