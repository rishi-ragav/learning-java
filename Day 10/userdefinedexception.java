// write a program to create a user defined exception for the following scenario:
// NumberIsGreater Exception and for NumberIsLess Exception

class NumberIsGreater extends Exception {   
    public NumberIsGreater(String str) {
        super(str);
    }
}
    
class NumberIsLess extends Exception {
    public NumberIsLess(String str) {
        super(str);
    }
}

public class userdefinedexception{
    static void validate(int num) throws NumberIsGreater, NumberIsLess {
        if (num > 100) {
            throw new NumberIsGreater("Number is greater than 100");
        } else if (num < 0) {
            throw new NumberIsLess("Number is less than 0");
        } else {
            System.out.println("Number is valid");
        }
    }

    public static void main(String[] args) {
        try{
            validate(10);
        }
        catch (NumberIsGreater ex){
            System.out.println("Caught the exception");
            System.out.println("Exception occured "+ex);

        }
        catch (NumberIsLess ex){
            System.out.println("Caught the exception");
            System.out.println("Exception occured "+ex);

        }
        System.out.println("rest of the code....");
    }
}
