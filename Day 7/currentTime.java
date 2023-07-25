// Write a program to print local date time in DDYYMMMM HH:MM:SS format

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class currentTime{

    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}