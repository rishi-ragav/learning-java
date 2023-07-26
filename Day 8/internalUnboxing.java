public class internalUnboxing {
    public static void main(String[] args) {
        Integer i = new Integer(50);
        if(i<100)
        {    // unboxing internally
            System.out.println(i);
        }
    }
}
