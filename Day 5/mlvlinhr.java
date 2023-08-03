//program to demonstrate multilevel inheritance

class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void print_B() {
        System.out.println("Class B");
    }
}

class C extends B {
    public void print_C() {
        System.out.println("Class C");
    }
}

public class mlvlinhr {
    public static void main(String[] args) {
        C obj = new C();
        obj.print_A();
        obj.print_B();
        obj.print_C();
        
    }
}
