import java.util.Arrays;

public class excerciseFive {
    public static void main(String[] args) {
        // Declare array
        int[] arrayOne = { 27, 14, 77, 85, 34, 16, 58, 34, 29, 39 };

        // Declare var to temporarily hold array elements
        int hold = 0;

        // Iterate through the array with var i
        for (int i = 0; i < arrayOne.length; i++) {
            // Iterate through the array with var j which is equal to i + 1
            for (int j = i + 1; j < arrayOne.length; j++) {
                /*
                 * Compare first iteration /w second iteration
                 * If the first iteration is less than the second
                 * store it in the hold variable, set the first iteration's
                 * current index to the second iteration's index, and finally
                 * set the second iteration's index to the hold variable.
                 */
                if (arrayOne[i] > arrayOne[j]) {
                    hold = arrayOne[i];
                    arrayOne[i] = arrayOne[j];
                    arrayOne[j] = hold;
                }
            }
        }
        // Print the result
        System.out.println(Arrays.toString(arrayOne));
    }
}
