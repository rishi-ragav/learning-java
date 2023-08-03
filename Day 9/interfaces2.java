import java.util.ArrayList;
//import java.util.List;

public class interfaces2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
    // use indexOf() to find first occurrence of an element
    System.out.println("first index of 3: " + list.indexOf(3));
        int index = list.indexOf(3);
        System.out.println("element at index 3: " + list.get(index));

        // using loop for iteration
        System.out.println("using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // using for each loop
        System.out.println("using for each loop");
        for (Integer i : list) {
            System.out.println(i);
        }
}
}
