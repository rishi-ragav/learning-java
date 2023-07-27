//progrma to implement interfaces


import java.util.ArrayList;
import java.util.List;

public class interefaces1{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);

        //print element at 3rd index
        System.out.println(list.get(2));

        // replace element at 2nd index
        list.set(1, "Python");
        System.out.println(list);

    // use lastIndexOf() to find last occurrence of an element

    System.out.println("last index of Java: " + list.lastIndexOf("Java"));
    }
}
