//Hash Set is a set of items where every item is unique, and it is unordered. 
// Hashing is used to store the elements in the HashSet.
// HashSet is the best performing implementation of Set.
// HashSet permits null elements.
// It represents the collection that uses a hash table for storage.

import java.util.HashSet;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        //creating a HashSet and adding elements

        HashSet<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Python");
        set.add("C++");

        //traversing elements using iterator
        System.out.println("using iterator");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        

    }
}
