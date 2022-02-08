import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arrayOne = { 1, 2, 3, 4, 5};

        System.out.println(unicornpoo(arrayOne));
        System.out.println(arrayOne.length);
    }

    public static String unicornpoo(int[] a){

        int store = 0;

        int i = 0;
        int j = a.length;

        int[] unicornpoo = a;

        for(i = 0; i < a.length; i++){
            store = j;
            unicornpoo[i] = store;
            j--;
        }

        return Arrays.toString(unicornpoo);

    }
}