/*
 Number of odd sub arrays.
Find the number of distinct subarrays in an array of position 
integers such that the sum of the subarray is an
 odd integer, two subarray are consisdered different 
if they start or end at different index input.

   1 
   3  
   1 2 3
   [1] [1 2]  [1,2,3]  [2] [2,3]  [3] [1 3]
   4
 */

public class practicequestion7 
{
    public static void main(String[] args)
     {
            int n1 =3,n2=10,i;
            int a[]= new int[10];
            for(i=n1;i<n2;i++)
            {
                a[i]=i;
            }
            for(i=n1;i<n2;i++)
            {
                System.out.print(i);
            }
            
            
    }    
}
