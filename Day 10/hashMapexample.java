// write a program to a hashmap

import java.util.*;
import java.util.Map;
import java.util.HashMap;   


public class hashMapexample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.put(1, "D");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.putIfAbsent(4, "E");
        map.putIfAbsent(3, "Added");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.remove(1);
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.remove(2, "B");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.replaceAll((k,v) -> "F");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}