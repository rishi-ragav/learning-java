// write a program to write a file using file writer class where filename is test.txt and content is "Hello World"

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\vsc\\new folder\\learning-java\\Day 7\\test.txt");
            fw.write("Hello World");
            fw.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            
            System.out.println("Error in writing file");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}