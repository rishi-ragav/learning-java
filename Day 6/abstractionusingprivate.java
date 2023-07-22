// write a program to demonstrate abstraction using private access modifier

class animal
{
private int a= 10;
    void show()
    {
 // private access modifier
// private access modifier is used to restrict access to methods and variables.
// Only accessible within the declared class.
System.out.println("Private access modifier  " + a);
    }
}



public class abstractionusingprivate
{
    public static void main(String args[])
    {
        

        animal obj = new animal();
        obj.show();
        //System.out.println("Private access modifier  " + obj.a);   // error as a is private
        
    }
}

