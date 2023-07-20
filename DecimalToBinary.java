import java.util.Scanner;
//program to convert decimal to binary

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        String binaryNumber = convertDecimalToBinary(decimalNumber);
        
        System.out.println("Binary representation: " + binaryNumber);
        scanner.close();
    }
    
    public static String convertDecimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        
        if (decimalNumber == 0) {
            binary.append("0");
        }
        
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }
        
        return binary.toString();
    }
}