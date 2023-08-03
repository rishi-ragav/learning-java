

public class experiment {
public static void main(String[] args)
 {
    double start = System.nanoTime();
    
    for (int i = 0; i < 100000; i++) {
        System.out.print(i + " ");
        if (i % 20 == 0) {
            System.out.println("");
        }
    }
    double end = System.nanoTime();
    double execution = (end - start)/1000000000;
    System.out.println("");
    System.out.println("Execution time: " + execution + " seconds");
}    
}
