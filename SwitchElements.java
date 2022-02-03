import java.util.Arrays;

public class excerciseThree {
    public static void main(String[] args) {
        int[] arrayOne = {27, 14, 77, 85, 34,
                        16, 58, 34, 29, 39};

        System.out.println(switchElements(arrayOne, 3, 8));           
    }

    public static String switchElements(int[] array, int i, int j) {
            int hold = array[i];
            array[i] = array[j];
            array[j] = hold;
        return Arrays.toString(array);
    }
}
