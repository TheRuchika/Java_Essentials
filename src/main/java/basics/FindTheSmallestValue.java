package basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Finds the smallest value in an integer array.
 *
 * Demonstrates three approaches:
 * 1. Using iteration
 * 2. Using Arrays.sort()
 * 3. Using Collections.sort()
 */
public class FindTheSmallestValue {

    Integer[] givenArray = {5, 6, 3, 2, 7, 8};

    // ----------- Approach 1: Using iteration -----------

    /**
     * Finds the smallest value by comparing each element.
     */
    public void findSmallestValue() {

        // Initialize smallest with maximum possible integer value
        int smallest = Integer.MAX_VALUE;

        // Compare each element with current smallest value
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < smallest) {
                smallest = givenArray[i];
            }
        }

        System.out.println("Smallest value (loop): " + smallest);
    }

    // ----------- Approach 2: Using Arrays.sort() -----------

    /**
     * Sorts the array and retrieves the first element.
     */
    public void usingArrays() {

        // Sort array in ascending order
        Arrays.sort(givenArray);

        // First element will be the smallest
        System.out.println("Smallest value (Arrays.sort): " + givenArray[0]);
    }

    // ----------- Approach 3: Using Collections -----------

    /**
     * Converts array to List and uses Collections.sort().
     */
    public void usingCollections() {

        // Convert array to list
        List<Integer> list = Arrays.asList(givenArray);

        // Sort list in ascending order
        Collections.sort(list);

        // First element will be the smallest
        int smallest = list.get(0);
        System.out.println("Smallest value (Collections.sort): " + smallest);
    }

    public static void main(String[] args) {

        FindTheSmallestValue smallestValue = new FindTheSmallestValue();

        smallestValue.findSmallestValue();
        smallestValue.usingArrays();
        smallestValue.usingCollections();
    }
}
