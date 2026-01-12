package basics;

/**
 * Reverses the order of words in a given sentence.
 *
 * Example:
 * Input  : "Java Essentials Reverse Words"
 * Output : "Words Reverse Essentials Java"
 */
public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "Java Essentials Reverse Words";
        String reversedSentence = "";

        // Split the sentence into words using space
        String[] words = sentence.split(" ");

        // Print number of words (optional)
        System.out.println("Word count: " + words.length);

        // Loop from last word to first word
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence = reversedSentence + words[i] + " ";
        }

        // Print the reversed sentence
        System.out.println("Reversed words: " + reversedSentence);
    }
}
