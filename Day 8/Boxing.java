public class Boxing {
    static void m1(Integer i) {
        System.out.println("Integer");
    }
    static void m1(int i) {
        System.out.println("int...");
    }


    public static void main(String[] args) {
        short i = 50;
        Boxing.m1(i); 
        
}
}
