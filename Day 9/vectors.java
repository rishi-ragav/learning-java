import java.util.Vector;
// Vectors are similar to ArrayLists but Vector methods are synchronized
// and hence Vector is thread safe
// Vector is a legacy class
// Vector is synchronized
// Vector is slow
// synchronized means only one thread can access the vector at a time
// non synchronized means multiple threads can access the vector at a time
// threads are defined as a sequence of instructions that can be executed asynchronously
// Vector is dynamic array


public class vectors {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>();
        vector.add("Hello");
        vector.add("World");
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        vector.add("C");
        vector.add("JavaScript");
        vector.add("Ruby");
        vector.add("Perl");
        vector.add("PHP");
        vector.add("Go");
        System.out.println(vector);

        // print element at 3rd index
        System.out.println(vector.get(2));

        // replace element at 2nd index
        vector.set(1, "Python");
        System.out.println(vector);

        //add element at 1st index
        String s1 = vector.firstElement();
        String s2 = vector.lastElement();

        System.out.println("first element: " + s1);
        System.out.println("last element: " + s2);
    }
}
