import java.util.Arrays;

public class SelectionSort {
    // Selection Sort Algorithm
    // Two Iterations, compare index 0 /w 1, and so on
    // IF statement: if the second iteration is bigger, the input array index 0 is
    // now the value of the second iteration
    // Return the original (modified) array

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int hold = nums[j];
                    nums[j] = nums[i];
                    nums[i] = hold;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arrayOne = { 5, 2, 3, 1, 4 };
        System.out.println(Arrays.toString(sortArray(arrayOne)));
    }
}
