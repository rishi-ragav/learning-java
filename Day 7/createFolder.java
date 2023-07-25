import java.util.Scanner;
import java.io.File;


public class createFolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the folder to be created: ");
        String path = sc.next();
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Folder already exists");
        } else {
            file.mkdir();
            System.out.println("Folder created successfully");
        }
        sc.close();
    }
    // Output: 
    //Enter the name of the folder to be created: {Give the  name of the folder to be created}
    //Folder created successfully
}
