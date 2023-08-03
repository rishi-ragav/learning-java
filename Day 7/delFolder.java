// write a program to delete a folder
// use try and catch block to handle the exception like to delete the complete directory using a foreach loop
import java.util.Scanner;
import java.io.File;
public class delFolder {

public static void main(String[] args) 
{
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the folder to be deleted: ");
    String path = sc.next();
    File file = new File(path);
    if (file.exists())
     {
        File[] files = file.listFiles();
        for (File f : files) 
        {
            f.delete();
        }
        file.delete();
        System.out.println("Folder deleted successfully");
    } 
    else 
    {
        System.out.println("Folder does not exist");
    }
    sc.close();
    }
}