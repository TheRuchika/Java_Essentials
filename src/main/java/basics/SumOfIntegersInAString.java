package basics;

/**
 * Finds the sum of digits present in a given string.
 *
 * Example:
 * Input  : "JAVA66 ESSENTAILSS 123"
 * Digits : 6, 6, 1, 2, 3
 * Output : 18
 */
public class SumOfIntegersInAString {

    public static void main(String[] args) {

        // ----------- Approach 1: Using Regular Expression -----------

        String input = "JAVA66 ESSENTAILSS 123";

        // Remove all non-digit characters from the string
        String numbers = input.replaceAll("\\D", "");

        System.out.println("Numbers in the string = " + numbers);

        int sum = 0;

        // Loop through each digit character and add its numeric value
        for (int i = 0; i < numbers.length(); i++) {
            sum = sum + Character.getNumericValue(numbers.charAt(i));
        }

        System.out.println("Sum of the numbers = " + sum);

        System.out.println();

        // ----------- Approach 2: Using Character check -----------

        String input2 = "JAVA66 ESSENTAILSS 123";
        int total = 0;

        // Check each character and add only digits
        for (int i = 0; i < input2.length(); i++) {
            char character = input2.charAt(i);

            if (Character.isDigit(character)) {
                total = total + Character.getNumericValue(character);
            }
        }

        System.out.println("Approach 2 sum = " + total);
    }
}
