// check for arithmetic exception

public class testapp {
    
public static void main(String[] args) {
        calculator.add(10, 20);
        calculator.sub(10, 20);
        calculator.mul(10, 20);
        calculator.div(10, 20);

        try {
            calculator.div(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error in division");
            System.out.println(e);
            e.printStackTrace();
        }
        
}

}
