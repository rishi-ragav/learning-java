// write a program to implement multiple inheritance in java

class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B {
    public void print_B() {
        System.out.println("Class B");
    }
}

class C extends A, B {
    public void print_C() {
        System.out.println("Class C");
    }
}

public class multipleinheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.print_A();
        obj.print_B();
        obj.print_C();
        
    }
}
// Output: error because java does not support multiple inheritance
// Reason: If class B and class C have same method and you call it from child class object, 
//there will be ambiguity to call method of Class B or Class C.