public class loopin {
    public static void main(String[] args) {
        int a[] = {33,3,4,5};
        int min = a[1];
        for(int i=1; i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
 
         int max = a[1];
         for(int i=0;i<a.length;i++)
         {
            if(a[i]>max)
         {
            max = a[i];
         }
        }
        System.out.println("minimum value is "+ min);
        System.out.println("maximum value is "+ max);
    }

}
