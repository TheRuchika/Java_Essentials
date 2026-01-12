package basics;

/**
 * Counts the number of digits:
 * 1. In an integer number
 * 2. Inside a string containing letters and numbers
 */
public class CountNumberOfDigits {

    public static void main(String[] args) {

        // ----------- Count digits in an integer -----------

        int number = 123456789;
        int count = 0;

        // Loop runs until number becomes 0
        while (number > 0) {
            number = number / 10; // Remove last digit
            count++;              // Increase digit count
        }

        System.out.println("Number of digits in the integer: " + count);

        System.out.println();

        // ----------- Count digits in a string -----------

        String stringWithNumbers = "1223RU3CHIKA124124";
        int count2 = 0;

        // Traverse each character in the string
        for (int i = 0; i < stringWithNumbers.length(); i++) {
            char ch = stringWithNumbers.charAt(i);

            // Check if character is a digit
            if (Character.isDigit(ch)) {
                count2++;
            }
        }

        System.out.println("Number of digits in the string: " + count2);
    }
}
