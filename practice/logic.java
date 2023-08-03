import java.lang.Math;

public class logic {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Error in division");
            System.out.println(" ");
            System.out.println(e);
            e.printStackTrace();
        }
        return 0;
    }
    static int mod(int a, int b){
        return a%b;
    }
    static int pow(int a, int b){
        return (int)Math.pow(a,b);
    }

}
