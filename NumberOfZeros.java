public class excerciseOne {
    public static void main(String[] args) {
        int[] arrayOne = { 2, 7, 0, 8, 0 };

        System.out.println(numberOfZeros(arrayOne));

    }

    public static int numberOfZeros(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count += 1;
            }
        }
        return count;
    }
}