
/*Given a string ,write a python function to return True if
 the 
 strings  'mat' and 'jet' appear the same number
 of times in a given string ,else return False

 Jet on the Mat but mat is too long     :False
 jet Jet Mat mat:		          True */

import java.util.Scanner;

public class practicequestion4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int count1=0,count2=0;
        sc.close();
        for(int i=0;i<str.length()-2;i++)
        {
            if(str.charAt(i)=='m' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t')
            {
                count1++;
            }
            if(str.charAt(i)=='j' && str.charAt(i+1)=='e' && str.charAt(i+2)=='t')
            {
                count2++;
            }
        }
        if(count1==count2)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}