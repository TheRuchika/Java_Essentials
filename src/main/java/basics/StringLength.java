package basics;

/**
 * Finds the length of a String using:
 * 1. Built-in length() method
 * 2. Manual counting without using length()
 */
public class StringLength {

    public static void main(String[] args) {

        String givenString = "JavaEssentials";

        // ----------- Method 1: Using length() -----------

        // length() returns the number of characters in the string
        System.out.println("Length of the string is: " + givenString.length());

        // ----------- Method 2: Without using length() -----------

        // Convert string to character array
        char[] charString = givenString.toCharArray();

        int count = 0;

        // Count each character manually
        for (char ch : charString) {
            count++;
        }

        System.out.println("Length of the string is: " + count);
    }
}
