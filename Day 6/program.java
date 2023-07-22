//Program to demonstrate method overriding

class animal
{
    void show()
    {
        System.out.println("Animal");
    }
}

class human extends animal
{
    void show()
    {
        System.out.println("Human");
    }
}


public class program
{
    public static void main(String args[])
    {
        human obj = new human();
        obj.show();
    }
}

// Output: Human