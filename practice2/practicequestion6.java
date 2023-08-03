/*
Write a Python function which accepts a string and returns a 
string made of the first 2 and the last 2 characters
of the given string.If the  string length  is less than 2, 
return -1.

Note: If the string length is equal to 2, consider the 2 
characters to be the first as well as the last two characters.

Sample Input	Expected Output

   w3resource	w3ce
   w3	        w3w3
    A	        -1
    
*/
import java.util.Scanner;
public class practicequestion6
{
    public static void main(String[] args) {
        String s;
        char s1,s2,s3,s4;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        
        
            s1 = s.charAt(0);

            s2=  s.charAt(1); 
            int a = s.length();
            int b= a-1;
            int c=a-2;
            s3 =s.charAt(b); 
            s4= s.charAt(c);
        
        System.out.print(s1 +""+s2+""+""+s3+""+s4);
        String sa = s1 +""+s2+""+""+s3+""+s4;
        System.out.println(sa);
    }
}
