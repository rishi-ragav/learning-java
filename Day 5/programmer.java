public class programmer extends employee // Inheritance (Day 5\employee.java) 
{
    public static void main(String[] args) {
        programmer e1 = new programmer();
        e1.empid = 1;
        e1.name = "Rahul";
        e1.salary = 10000;
        System.out.println("Employee ID: " + e1.empid);
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);

        System.out.println(" ");

        programmer e2 = new programmer();
        e2.empid = 2;
        e2.name = "Rohit";
        e2.salary = 20000;
        System.out.println("Employee ID: " + e2.empid);
        System.out.println("Name: " + e2.name);
        System.out.println("Salary: " + e2.salary);

        System.out.println(" ");

        programmer e3 = new programmer();
        e3.empid = 3;
        e3.name = "Raj";
        e3.salary = 30000;
        System.out.println("Employee ID: " + e3.empid);
        System.out.println("Name: " + e3.name);
        System.out.println("Salary: " + e3.salary);

        
    }
}
