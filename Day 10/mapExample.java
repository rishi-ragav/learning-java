import java.util.HashMap;
import java.util.Map;


public class mapExample {
    public static void main(String[] args) {
        Map<Integer, book> map = new HashMap<Integer, book>();
        // Creating Books
        book b1 = new book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        book b2 = new book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        book b3 = new book(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        // Traversing map
        for (Map.Entry<Integer, book> entry : map.entrySet()) {
            int key = entry.getKey();
            book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }    
}
