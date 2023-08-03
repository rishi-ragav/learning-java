//1. Write a Java program to find the largest and smallest elements in an array of integers.

public class set2question1 {
public static void main(String[] args) {
    int a[]={100,10,5,200,150,1000,300};
    int max=a[0];
    int min=a[0];
    int i;

    for(i=1;i<a.length;i++)
    {
        if(max<a[i])
        {
            max =a[i];
        }
        if(min>a[i])
        {
            min = a[i];
        }

    }
    System.out.println(max);
    System.out.println(min);

}
    
}
