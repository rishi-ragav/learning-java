/*
 Given a number n, write a program to find the sum of the 
largest prime factors of each of nine consecutive numbers 
starting from n.
g(n) = f(n) + f(n+1) + f(n+2) + f(n+3) + f(n+4) + f(n+5) + 
f(n+6) +f(n+7) + f(n+8)
where, g(n) is the sum and f(n) is the largest prime factor 
of n
For example,
g(10)=f(10)+f(11)+f(12)+f(13)+f(14)+f(15)+f(16)+f(17)+f(18)
        =5 + 11 + 3 +   13 +   7 +    5 +   2 +  17 + 3
        =66
 */

import java.util.Scanner;

public class programming_file
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=n;i<n+9;i++)
        {
            int max=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    int flag=0;
                    for(int k=2;k<=j/2;k++)
                    {
                        if(j%k==0)
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        if(j>max)
                        {
                            max=j;
                        }
                    }
                }
            }
            sum=sum+max;
        }
        System.out.println(sum);
    }
}
