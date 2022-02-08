import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arrayOne = { 1, 2, 3, 4, 5};

        System.out.println(reversedArray(arrayOne));
    }

    public static String reversedArray(int[] a){

        int store = 0;

        int i = 0;
        int j = a.length;

        int[] reversedArray = a;

        for(i = 0; i < a.length; i++){
            store = j;
            reversedArray[i] = store;
            j--;
        }

        return Arrays.toString(reversedArray);
    }
    
}