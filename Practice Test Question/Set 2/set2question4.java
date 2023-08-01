//4. Write a Java program to check if a given number is a prime number using the trial division method.

public class set2question4 {
    public static void main(String[] args) {
        int n=43,parser=0,i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                parser++;
            }
        }
        if(parser>0 )
        {
            System.out.println("Not a prime");
        }
        else
        {
            System.out.println("prime");
        }

    }
}
