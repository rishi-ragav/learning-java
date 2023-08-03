import java.util.Scanner;
public class practicequestion2 {
    public static void main(String[] args) {
        
        double salary, level;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        salary = sc.nextDouble();
        System.out.println("Enter level");
        level = sc.nextDouble();
        sc.close();
        if(level==3)
        {
            System.out.println("Salary: "+ ( salary*1.15));

        }
        else if(level==4)
        {
            System.out.println("Salary: "+ ( salary*1.07));
        }
        else if(level==5)
        {
            System.out.println("Salary: "+ ( salary*1.05));
        }
        else{
            System.out.println("Salary: " + salary);
        }
    }
    
}
