/*Algorithm which determines how many elements of an
array are in acending order
*/
public class excerciseTwo {
    public static void main(String[] args) {
        int[] arrayOne = {2, 7, 0, 8, 0};
        // Expected Result: 2
        int[] arrayTwo = {2, 4, 7, 8, 9};
        // Expected Result: 5
        int[] arrayThree = {3, 5, 5, 6, 5};
        // Expected Result: 4

        System.out.println("Array One: " + ascendingOrderAmount(arrayOne));
        System.out.println("Array Two: " + ascendingOrderAmount(arrayTwo));
        System.out.println("Array Three: " + ascendingOrderAmount(arrayThree));
    }

    public static int ascendingOrderAmount(int[] array) {
        /*
         * Start at one, rather than 0, because
         * we want to compare the second element
         * and the previous element, etc. If index
         * started at 0, there would be nothing to
         * compare to and therefore would display an
         * error
         */
        int index = 1;
        int n = array.length;

        while (index < n && array[index - 1] <= array[index]) {
            index += 1;
        }
        return index;
    }
}
