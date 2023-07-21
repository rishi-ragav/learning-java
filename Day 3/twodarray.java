//program to print 2d array

public class twodarray {
    public static void main(String[] args) {
        int[][] a = {{2,3,4},{4,5,6}};
        for(int i=0; i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(a[i][j]);
            }
            System.out.println("");
        }
    }
}
