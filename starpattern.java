public class starpattern {
    public static void main(String[] args) {
        int i,j,k,m=1;
        for ( i = 0; i <5; i++) {
            for ( j = 1; j <5 - i; j++) {

                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}