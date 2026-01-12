package basics;

import java.util.*;

/**
 * Demonstrates different ways to reverse a String in Java.
 *
 * Approaches:
 * 1. Using length() and charAt()
 * 2. Using character array
 * 3. Using StringBuffer
 * 4. Using Collections
 */
public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";

        // ----------- Method 1: Using length() and charAt() -----------

        // Loop from last index to first index
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
        System.out.println();

        // ----------- Method 2: Using character array -----------

        // Convert string to char array
        char[] strChar = str.toCharArray();

        // Traverse the array in reverse order
        for (int i = strChar.length - 1; i >= 0; i--) {
            System.out.print(strChar[i]);
        }

        System.out.println();
        System.out.println();

        // ----------- Method 3: Using StringBuffer -----------

        // StringBuffer has a built-in reverse() method
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        System.out.println();
        System.out.println();

        // ----------- Method 4: Using Collections -----------

        // Convert char array to a List
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        // Reverse the list using Collections
        Collections.reverse(list);

        // Print reversed characters using iterator
        for (Character ch : list) {
            System.out.print(ch);
        }
    }
}
