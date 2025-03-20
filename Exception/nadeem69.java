import java.io.*;
import java.util.Scanner;

public class nadeem69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input year and month from the user
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
            return;
        }
        // Print the calendar for the specified month and year
        printCalendar(year, month);

        scanner.close();
    }

    private static void printCalendar(int year, int month) {
        System.out.println("\nCalendar for " + getMonthName(month) + " " + year + "\n");

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Calculate the day of the week for the first day of the month
        int dayOfWeek = getDayOfWeek(year, month, 1);

        // Print leading spaces based on the day of the week
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("    ");
        }
        // Print each day of the month
        for (int day = 1; day <= getDaysInMonth(year, month); day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((day + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }   

    private static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int dayOfWeek = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (dayOfWeek + 5) % 7;
    }

    private static int getDaysInMonth(int year, int month) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static String getMonthName(int month) {
        String[] monthNames = { "", "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };
        return monthNames[month];
    }
}
