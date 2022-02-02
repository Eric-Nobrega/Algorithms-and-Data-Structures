public class arraySum {
    public static void main(String[] args) {
        // Declare and initialise array
        int[] arrayOne = { 4, 8, 1, 3, 10, 24, 37 };

        // Execute the algorithm
        System.out.println(sumArray(arrayOne));
    }

    // Array Sum Algorithm
    public static int sumArray(int[] array) {

        // Count Var that will be used to keep track of position of operation
        int count = 0;

        // Total Var that will be use to keep track of the total sum of array
        int total = 0;

        // For loop that iterates the Count Var while it is less then the length of the
        // given array
        for (count = 0; count < array.length; count++) {
            total += array[count];
        }
        // Return the modified total Var
        return total;
    }
}