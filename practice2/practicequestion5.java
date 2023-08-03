/*
 *Write a python function which accepts a sentence and
 returns a list in which first value is the count of 
upper case letters and second value is the count of lower 
case letters in the sentence. Ignore spaces
, numbers and other special characters if any.

Sample Input	   Expected Output
Hello world!	        [1,9]   
Welcome to Mysore	[2,13]
 */
import java.util.Scanner;
public class practicequestion5 {
    public static void main(String[] args) {
        
    
        String st;
            int up=0,low=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A STRING:");
            st=sc.nextLine();
    
            for(int i=0;i<st.length();i++)
            {
                if(st.charAt(i)>=65 && st.charAt(i)<=90 )
                {
                    up++;
                }
                if(st.charAt(i)>=97 && st.charAt(i)<=122 )
                {
                    low++;
                }
            }
            System.out.println("["+up+","+low+"]");
        
    }
}
