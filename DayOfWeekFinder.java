import java.util.Scanner;

public class DayOfWeekFinder {

    public static String findDay(int month, int day, int year) {
        int q = day;
        int m = month;
        int y = (m < 3) ? year - 1 : year;
        m = (m < 3) ? m + 12 : m;
        int K = y % 100;
        int J = y / 100;

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J) % 7;

        String[] daysOfWeek = { "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" };
        return daysOfWeek[(h + 7) % 7];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (format: MM DD YYYY):");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        String dayOfWeek = findDay(month, day, year);
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}
