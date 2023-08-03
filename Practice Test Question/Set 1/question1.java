//1. Write a Java program to find the sum of all elements in an array of integers

public class question1{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum=0,i;
        for(i=0; i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("The Sum is "+ sum); 
                


    }
}