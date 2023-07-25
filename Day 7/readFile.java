// write a program to read the contents of a file and display them on the console.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile{
public static void main(String[] args) {
    try {
        File myObj = new File("D:\\vsc\\new folder\\learning-java\\Day 7\\test.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
}

}