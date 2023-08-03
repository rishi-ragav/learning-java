// write a program to demonstrate private constructor

class animal
{
    private animal()
    {
        System.out.println("Private constructor");
    }
    void show()
    {
        System.out.println("Private access modifier");
    }
}

public class privateconstructor
{
    public static void main(String args[])
    {
       //   animal obj = new animal(); // error as constructor is private. 
      //constructor cannot be called from outside the class
     // obj.show();
    }
}