package basics;

import java.util.HashMap;

/**
 * Counts the number of occurrences of each character in a string.
 *
 * Example:
 * Input  : "RUCHIKAAA"
 * Output : {R=1, U=1, C=1, H=1, I=1, K=1, A=3}
 */
public class LetterCount {

    public static void main(String[] args) {

        // Call method to count letters
        countLetters("RUCHIKAAA");
    }

    /**
     * Counts and prints character frequency using HashMap.
     *
     * @param typed_name input string
     */
    public static void countLetters(String typed_name) {

        // HashMap to store character as key and count as value
        HashMap<Character, Integer> map = new HashMap<>();

        // Convert string to character array
        char[] charName = typed_name.toCharArray();

        // Iterate through each character
        for (Character c : charName) {

            // If character already exists, increment count
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            // If character does not exist, add it with count 1
            else {
                map.put(c, 1);
            }
        }

        // Print character count
        System.out.println(map);
    }
}
