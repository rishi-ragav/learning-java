public class unboxingExample {
    
    public static void main(String[] args) {
        Integer a = new Integer(50);
        int a2 = a.intValue(); // unboxing
        int a3 = a; // unboxing
        System.out.println(a2+" "+a3);
    }
}
