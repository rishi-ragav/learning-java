// Write a program to demonstrate single inheritance where base class is college and the derieved class is student.

class college {
    public void print_college() {
        System.out.println("College");
    }
}

class student extends college {
    public void print_student() {
        System.out.println("Student");
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        student obj = new student();
        obj.print_college();
        obj.print_student();
    }
}