public class byteandshort {
    public static void main(String[] args) {
        
    short s = 30; // 2 bytes
    byte b = 10; // 1 byte
    int i = 50; // 4 bytes
    long l = 60; // 8 bytes
    System.out.println(s);
    System.out.println(b);
    System.out.println(i);
    System.out.println(l);

    short s1 = b;
    System.out.println(s1);

    int i1 = s;
    System.out.println(i1); // automatic type conversion aka widening conversion

    int i2 = b;
    System.out.println(i2);

    long l1 = i;
    System.out.println(l1);

    float f = 10.5f;
    double d = f;
    System.out.println(d);

    double d1 = 20.5;
    float f1 = (float)d1; // explicit type conversion aka narrowing conversion
    System.out.println(f1);

    }
}
