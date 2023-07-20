import java.util.Scanner;
//program to add two matrices
public class two2arrayinput {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix: ");
    int b[][] = new int[n][n];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            b[i][j] = sc.nextInt();

        }
    
    }
    int sum[][] = new int[n][n];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
        sum[i][j] = a[i][j] + b[i][j];
    }
}
        sc.close();
        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the matrices is: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
