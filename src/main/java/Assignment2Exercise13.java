package main.java;

import java.text.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Assignment2Exercise13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter date in format (yyyyMMdd): ");
        String input = scanner.nextLine();
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        SimpleDateFormat outputDateFormat1 = new SimpleDateFormat("MM/dd/yy", Locale.US);
        SimpleDateFormat outputDateFormat2 = new SimpleDateFormat("dd E MMMM yyyy", Locale.US);
        Date inputDate;
        try {
            inputDate = inputDateFormat.parse(input);
            System.out.println(outputDateFormat1.format(inputDate));
            System.out.println(outputDateFormat2.format(inputDate));
        } catch (ParseException e) {
            System.out.println("Please make sure input date is in format yyyMMdd");
        }
        scanner.close();
    }
}
