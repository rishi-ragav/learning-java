public class question2 {
    
    public static void main(String[] args) {
        int n = 3443,rev=0,digit,org=n;
        for(n=n; n>0;n= n/10)
        {
            digit = n%10;            // Using for loop
            rev = rev*10 + digit;
        }
        /*while(n>0){
            digit = n%10;
            rev = rev*10 + digit;    // Using While Loop
            n = n/10;
        } */
        System.out.println(rev);
        if(org == rev)
        {
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }

}
