class RBIbank{
    public  void getInterestRate(){
        System.out.println("Interest Rate is 5%");
    }
}

class SBIbank extends RBIbank{
    public void getInterestRate(){
        System.out.println("Interest Rate is 6%");
    }
}

class ICICIbank extends RBIbank{
    public void getInterestRate(){
        System.out.println("Interest Rate is 7%");
    }
}
class Axisbank extends RBIbank{
    public void getInterestRate(){
        System.out.println("Interest Rate is 8%");
    }
}

public class bank{
    public static void main(String args[]){
        RBIbank rbi = new RBIbank();
        SBIbank sbi = new SBIbank();
       ICICIbank icici = new ICICIbank();
        Axisbank axis = new Axisbank();        

        sbi.getInterestRate();
        icici.getInterestRate();
        rbi.getInterestRate();
        axis.getInterestRate();
    }
}
