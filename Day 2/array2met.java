/**
 * array2met
 * 
 */
// program to return array from method
public class array2met {

    static int[] get()
    {
        return new int[]{10,20,30};
    }
    public static void main(String[] args) {
        int a[]=get();
        for (int i : a) {
            System.out.println(i);
        }
    }
}