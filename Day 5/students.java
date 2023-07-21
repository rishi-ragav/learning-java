// A program to demonstrate the use of classes and objects in Java  

//import java.util.Scanner;

    
public class students {
    public static void main(String[] args) {
         
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.rollno = 1;
        s1.name = "Rahul";
        s1.sub1 = 90;
        s1.sub2 = 80;
        s1.sub3 = 70;
        s1.total = s1.sub1 + s1.sub2 + s1.sub3;
        System.out.println("Roll no: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Subject 1: " + s1.sub1);
        System.out.println("Subject 2: " + s1.sub2);
        System.out.println("Subject 3: " + s1.sub3);
        System.out.println("Total: " + s1.total); 
        


        s2.rollno = 1;
        s2.name = "Rahul";
        s2.sub1 = 90;
        s2.sub2 = 80;
        s2.sub3 = 70;
        s2.total = s2.sub1 + s2.sub2 + s2.sub3;
        System.out.println("Roll no: " + s2.rollno);
        System.out.println("Name: " + s2.name);
        System.out.println("Subject 1: " + s2.sub1);
        System.out.println("Subject 2: " + s2.sub2);
        System.out.println("Subject 3: " + s2.sub3);
        System.out.println("Total: " + s2.total); 
        
        
        s3.rollno = 1;
        s3.name = "Rahul";
        s3.sub1 = 90;
        s3.sub2 = 80;
        s3.sub3 = 70;
        s3.total = s3.sub1 + s3.sub2 + s3.sub3;
        System.out.println("Roll no: " + s3.rollno);
        System.out.println("Name: " + s3.name);
        System.out.println("Subject 1: " + s3.sub1);
        System.out.println("Subject 2: " + s3.sub2);
        System.out.println("Subject 3: " + s3.sub3);
        System.out.println("Total: " + s3.total); 
        

        //The above piece of code is perfeectly correct but it has been commmented 
        //out because we want to take input from the user.
        
        
        
        /*
        student s1 = new student();
        student s2 = new student();
        Scanner sc = new Scanner(System.in);
      
        //taking input for s1

        System.out.println("Enter the roll number: ");
        s1.rollno = sc.nextInt();
        System.out.println("Enter the name: ");
        s1.name = sc.next();
        System.out.println("Enter the marks of subject 1: ");
        s1.sub1 = sc.nextDouble();
        System.out.println("Enter the marks of subject 2: ");
        s1.sub2 = sc.nextDouble();
        System.out.println("Enter the marks of subject 3: ");
        s1.sub3 = sc.nextDouble();
        s1.total = s1.sub1 + s1.sub2 + s1.sub3;
        
        // taking input for S2
        
        System.out.println("Enter the roll number: ");
        s2.rollno = sc.nextInt();
        System.out.println("Enter the name: ");
        s2.name = sc.next();
        System.out.println("Enter the marks of subject 1: ");
        s2.sub1 = sc.nextDouble();
        System.out.println("Enter the marks of subject 2: ");
        s2.sub2 = sc.nextDouble();
        System.out.println("Enter the marks of subject 3: ");
        s2.sub3 = sc.nextDouble();
        s2.total = s2.sub1 + s2.sub2 + s2.sub3;
        
        
        //printing S1


        System.out.println("Roll no: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Subject 1: " + s1.sub1);
        System.out.println("Subject 2: " + s1.sub2);
        System.out.println("Subject 3: " + s1.sub3);
        System.out.println("Total: " + s1.total);
        s1.average();

        //printing S2

        System.out.println("Roll no: " + s2.rollno);
        System.out.println("Name: " + s2.name);
        System.out.println("Subject 1: " + s2.sub1);
        System.out.println("Subject 2: " + s2.sub2);
        System.out.println("Subject 3: " + s2.sub3);
        System.out.println("Total: " + s2.total);
        s2.average();
        
        // closing the scanner object

        sc.close();
        */
  
    }
}


