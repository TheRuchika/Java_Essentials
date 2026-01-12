package basics;

/**
 * Checks whether a given element is present in an array.
 *
 * Demonstrates:
 * 1. Using normal for loop
 * 2. Using enhanced for-each loop
 */
public class ArrayContainsElementOrNot {

    // Array to search
    int[] array = {1, 2, 3, 4, 5, 6, 8, 3};

    // Element to find
    int numberToFind = 3;

    boolean found = false;

    /**
     * Checks element presence using a normal for loop.
     */
    public void presentOrNot() {

        // Iterate through array using index
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                found = true;
                break; // Stop loop once element is found
            }
        }

        if (found) {
            System.out.println("Element is present (for loop)");
        } else {
            System.out.println("Element is not present (for loop)");
        }
    }

    /**
     * Checks element presence using for-each loop.
     */
    public void forEachLoop() {

        found = false; // reset flag before checking

        // Iterate through array values directly
        for (int value : array) {
            if (value == numberToFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is present (for-each loop)");
        } else {
            System.out.println("Element is not present (for-each loop)");
        }
    }

    public static void main(String[] args) {
        ArrayContainsElementOrNot checker = new ArrayContainsElementOrNot();
        checker.presentOrNot();
        checker.forEachLoop();
    }
}
