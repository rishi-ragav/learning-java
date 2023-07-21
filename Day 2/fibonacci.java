import java.util.Scanner;
//program to print fibonacci series
public class fibonacci {
    public static void main(String[] args) {
/*        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        } */
     int n, a=0, b=0, c=1;;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series: ");
        for(int i=1;i<=n;i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a + " ");
        }
    }

}

