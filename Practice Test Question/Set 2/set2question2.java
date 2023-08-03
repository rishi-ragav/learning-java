//3. Write a Java program to print the first 15 numbers of the Fibonacci sequence.
public class set2question2
{
    public static void main(String[] args)
    {
        int l=0,m=0,n=1,i;
        for(i=0;i<15;i++)
        {
            l=m;
            m=n;
            n=l+m;
            System.out.println(l+" count:" +(i+1));
        }
    }
}
