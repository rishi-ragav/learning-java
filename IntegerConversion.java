//program to convert integer to byte, character and float

public class IntegerConversion {
    public static void main(String[] args) {
        int integerValue = 97;
        
        // Convert to byte
        byte byteValue = (byte) integerValue;
        System.out.println("Integer value converted to byte: " + byteValue);
        
        // Convert to character
        char charValue = (char) integerValue;
        System.out.println("Integer value converted to character: " + charValue);
        
        // Convert to float
        float floatValue = (float) integerValue;
        System.out.println("Integer value converted to float: " + floatValue);
    }
}