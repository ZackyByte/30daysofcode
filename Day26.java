import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int returnedDay = scanner.nextInt();
        int returnedMonth = scanner.nextInt();
        int returnedYear = scanner.nextInt();

        int dueDay = scanner.nextInt();
        int dueMonth = scanner.nextInt();
        int dueYear = scanner.nextInt();

        int fine = 0;

        if (returnedYear > dueYear) {
            fine = 10000; // returned after the calendar year, fixed fine
        } else if (returnedYear == dueYear) {
            if (returnedMonth > dueMonth) {
                fine = 500 * (returnedMonth - dueMonth); // returned after the expected month, calculate fine per month
            } else if (returnedMonth == dueMonth && returnedDay > dueDay) {
                fine = 15 * (returnedDay - dueDay); // returned after the expected day within the same month, calculate fine per day
            }
        }

        System.out.println(fine);

        scanner.close();
    }
}
