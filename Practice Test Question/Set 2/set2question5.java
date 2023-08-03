//5. Write a Java program to calculate the sum of the digits of a given number using a loop
public class set2question5 {
    public static void main(String[] args) {
        int n=34543,i,sum=0,digit;
        for(n=n;n>0;n=n/10)
        {
            digit = n%10;
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}
