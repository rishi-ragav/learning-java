import java.util.*;

// advantages of linked list over array list are:
// 1. insertion and deletion is faster
// 2. no need to specify size
// 3. no need to shift elements
// 4. memory is allocated at run time
// 5. memory utilization is efficient
// 6. random access is not allowed
// 7. The manipulation is fast because no shifting is required
// 8. It maintains the insertion order and is non-synchronized


public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);

        // print element at 3rd index
        System.out.println(list.get(2));

        // replace element at 2nd index
        list.set(1, "Python");
        System.out.println(list);

        // use lastIndexOf() to find last occurrence of an element

        System.out.println("last index of Java: " + list.lastIndexOf("Java"));

        // Using addall() to add all elements of another collection

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("C++");
        list2.add("C");
        list2.add("Python");
        list2.add("Java");
        list2.add("JavaScript");
        list2.add("Ruby");
        list2.add("Perl");
        list2.add("PHP");
        list2.add("Go");
        list2.add("Swift");
        list2.add("Kotlin");
        list2.add("Rust");
    
        list.addAll(list2);
        System.out.println(list);
        
    }    
}
