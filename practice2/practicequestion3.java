import java.util.Scanner;
/*
 *->A traveler on a visit to India is in need of some Indian
 Rupees (INR)but he has money belonging to another currency.
 He wants to know how much money he should provide in the
currency he has, to get the specified amount in INR.
->Write a python program to implement a currency calculator 
which accepts the amount needed in INR and the name of the 
currency which the traveler has. 
->The program should identify and display the amount the
 traveler should provide in the currency he has, to get the
 specified amount in INR.
->Note: Use the forex information provided in the table below 
for the calculation. 
->Consider that only the currency names mentioned in the table 
are valid.
For any invalid currency name, display -1.
Currency	                Equivalent of 1.00 INR
Euro	                   		0.01417  
British Pound	   			0.0100 
Australian Dollar	   		0.02140 
Canadian Dollar	   			0.02027
 */

public class practicequestion3 
{
    public static void main(String[] args) 
    {
        double currency,cost;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost of product in INR");
        cost = sc.nextDouble();
        
        System.out.println("Enter \n 1.Euro \n 2.Pound \n 3.Austrailan \n 4.Candaian");
        currency = sc.nextDouble();
        if(currency==1)
        {
            System.out.println(cost*0.01417 +" Euros");
        }
        else if(currency==2)
        {
            System.out.println(cost*0.0100+ " British Pounds");
        }
        else if(currency==3)
        {
             System.out.println(cost*0.02140 + " Austrailian Dollars");
        }
        else if(currency==4)
        {
             System.out.println(cost*0.02027+ " Canadian Dollars");
        }
        else{
            System.out.println("Error: -1");
        }
        
    }
}
