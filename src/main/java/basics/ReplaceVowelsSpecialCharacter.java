package basics;

/**
 * Replaces vowels in a string with a special character.
 *
 * Demonstrates two approaches:
 * 1. Using character array and iteration
 * 2. Using replaceAll() with regular expression
 */
public class ReplaceVowelsSpecialCharacter {

    public static void main(String[] args) {

        // ----------- Approach 1: Using character array -----------

        String givenText = "JAVA ESSENTIALSSS";

        // Convert string to character array
        char[] charArray = givenText.toCharArray();

        // Loop through each character
        for (int i = 0; i < givenText.length(); i++) {

            // Check if character is a vowel (both upper and lower case)
            if (givenText.charAt(i) == 'A' || givenText.charAt(i) == 'E'
                    || givenText.charAt(i) == 'I' || givenText.charAt(i) == 'O'
                    || givenText.charAt(i) == 'U'
                    || givenText.charAt(i) == 'a' || givenText.charAt(i) == 'e'
                    || givenText.charAt(i) == 'i' || givenText.charAt(i) == 'o'
                    || givenText.charAt(i) == 'u') {

                // Replace vowel with '*'
                charArray[i] = '*';
            }
        }

        // Print modified character array
        for (int i = 0; i < givenText.length(); i++) {
            System.out.print(charArray[i]);
        }

        System.out.println();

        // ----------- Approach 2: Using replaceAll() -----------

        String newText = "JAAAAVAAA ESSEENTIIALSSS";

        // Replace all vowels using regex
        String replaceText = newText.replaceAll("[AEIOUaeiou]", "@");

        System.out.println(replaceText);
    }
}
