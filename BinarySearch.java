public class BinarySearch {
    // Take a sorted int array, and the item to be searched
    private static Integer binarySearch(int[] a, int item) {

        // Used to compare the whole array
        int low = 0;

        /*
         * high is length - 1, as the length is 20,
         * however, the index of the last number is 19,
         * since arrays are indexed from 0.
         */
        int high = a.length - 1;

        /*
         * While loop that while continue as long as
         * the low value is less than or equal to the high value.
         */
        while (low <= high) {
            // Half the array, eliminating the half we don't need.
            int mid = (low + high) / 2;
            // See int guess to the index of the new halfed index's value.
            int guess = a[mid];
            // Check if guess is equal to item value
            if (guess == item) {

                // If the number is present, return it's index.
                return mid;
            }
            // If the guess value is too high, half the upper half
            if (guess > item) {
                high = mid - 1;
                // If the guess value is too low, half the lower half
            } else {
                low = mid + 1;
            }
        }

        // If the number is not present, return null.
        return null;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        // Worst case is log 20 = 4.31.
        System.out.println(binarySearch(array, 8)); // Expected Result: 7
        System.out.println(binarySearch(array, -1)); // Expected Result: null

    }
}