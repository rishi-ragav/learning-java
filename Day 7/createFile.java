//write a program to create a file by taking directory as input. 
//If the file already exists, display a message saying that the file already exists.

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class createFile {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the file to be created: ");
    String path = sc.next();
    File file = new File(path);
    try {
        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    } catch (IOException e) {
        System.out.println("An error occurred");
        e.printStackTrace();
    }
    sc.close();
}
    // output : Enter the name of the file to be created: 
}
