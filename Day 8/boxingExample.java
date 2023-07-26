// boxing is the process of converting a primitive data type to an object of the corresponding wrapper class

public class boxingExample {
public static void main(String[] args) {
    int a=50;
    Integer a2 = new Integer(a); //boxing
    Integer a3 = 5; // boxing
    System.out.println(a2+" "+a3);
}    
}
