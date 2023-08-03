import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operation to be performed: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("The sum is: "+logic.add(a,b));
                    break;
            case 2: System.out.println("The difference is: "+logic.sub(a,b));
                    break;
            case 3: System.out.println("The product is: "+logic.mul(a,b));
                    break;
            case 4: System.out.println("The quotient is: "+logic.div(a,b));
                    break;
            case 5: System.out.println("The remainder is: "+logic.mod(a,b));
                    break;
            case 6: System.out.println("The result is: "+logic.pow(a,b));
                    break;
            default: System.out.println("Invalid choice");
        }
        sc.close();
    }

   
    
}
