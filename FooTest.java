public class FooTest {

    public int foo(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                count++;
            }
        }
        return count; // you will need to edit the return value
    }

    public static void main(String[] args) {
        FooTest  fooTest = new FooTest ();
        int[] data = { 2, 7, 0, 8, 0 };
        int output = fooTest.foo(data);
        System.out.println("The array contains " + output + " occurrences of 0.");
    }
}