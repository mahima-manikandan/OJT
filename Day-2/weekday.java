//Write a program to read a weekday number and print weekday name using switch statement

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a weekday number (1-7): ");
        int dayNumber = scanner.nextInt();
        
        String weekdayName = getWeekdayName(dayNumber);
        System.out.println("Weekday: " + weekdayName);
    }
    
    public static String getWeekdayName(int dayNumber) {
        String weekdayName;
        switch(dayNumber) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                weekdayName = "Invalid day number";
        }
        return weekdayName;
    }
}
