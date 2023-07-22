// write a program to demonstrate abstraction
// data abstraction is the process of hiding certain details and showing only essential information to the user. 
//It is the concept of hiding irrelevant details from the user.
//real life example: A car is viewed as a car rather than its individual components.
//In java, abstraction is achieved using abstract classes and interfaces.
//An abstract class is a class that is declared abstract—it may or may not include abstract methods.
//An abstract method is a method that is declared without an implementation.
//An abstract class cannot be instantiated, which means you cannot create new instances of an abstract class.
//An abstract class can contain both abstract and non-abstract methods.
//An abstract class can have final methods (methods that cannot be overridden).
//An abstract class can have static methods (methods that can be called without creating an object).
//An abstract class can have a constructor and it is called when a concrete subclass is instantiated.
//An abstract class can have instance variables.
//An abstract class can have static variables.
//An abstract class can implement interfaces.
//An abstract class can be extended by a concrete class.
//An abstract class can extend another abstract class.
//An abstract class cannot extend a final class.
//An abstract class cannot be extended by a final class.
//An abstract class cannot be private.
//An abstract class can be nested in another class.
//An abstract class can be a top-level class.
//An abstract class can be a member of another class (nested class).
//An abstract class can be a local class.
//An abstract class can be an anonymous class.
//An abstract class can be a subclass of another class and an interface at the same time.
//An abstract class can be a subclass of another abstract class and an interface at the same time.

abstract class animal
{
    abstract void show();
}

class human extends animal
{
    void show()
    {
        System.out.println("Human");
    }
}

public class abstraction
{
    public static void main(String args[])
    {
        human obj = new human();
        obj.show();
    }
}

