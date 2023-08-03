
public class getinfo {
    public static void main(String[] args) {
        mutators s1 = new mutators(1001, "Rohith");
        
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());
        s1.setName("Rohith Manjunath");
        s1.setRollno(1003);
         System.out.println(s1.getName());
        System.out.println(s1.getRollno());
    }
}
