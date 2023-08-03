import java.util.Scanner;
public class practicequestion{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c= sc.nextInt();
         if(a!=7 && b!=7 && c!=7)
   {
       System.out.println(a*b*c);;
   }
   else if(b==7){
       System.out.println(c);;
   }
   else if(a==7){
       System.out.println(c*b);
   }
   else{

         System.out.println("-1");;
   }
     }
}