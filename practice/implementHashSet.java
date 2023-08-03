import java.util.HashSet;
import java.util.*;
import java.util.Iterator;

public class implementHashSet{
    
public static void main(String[] args) {
    

    HashSet<classStudent> set = new HashSet<classStudent>();
    classStudent s1 = new classStudent(1, "John", "Java");
   
    classStudent s2 = new classStudent(2, "Mary", "Python");
     classStudent s3 = new classStudent(3, "Peter", "C++");
    classStudent s4 = new classStudent(4, "Jane", "Kotlin");

    
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
    
    System.out.println(set);
}
    
}