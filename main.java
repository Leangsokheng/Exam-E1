import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date to convert in (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();


        if (isValidShortDate(shortDate)) {
            int year = Integer.parseInt(shortDate.substring(0, 4));
            int month = Integer.parseInt(shortDate.substring(5, 7));
            int day = Integer.parseInt(shortDate.substring(8, 10));

            String monthName = getMonthName(month);

            System.out.println("Full Date: " + monthName + " " + day + ", " + year);
        } else {
            System.out.println("Invalid short date format. Please enter in the format YYYY-MM-DD.");
        }

        scanner.close();
    }

    private static boolean isValidShortDate(String shortDate) {
        return shortDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}