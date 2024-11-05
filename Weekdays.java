import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        // Array to store the names of the days starting from Sunday (index 0)
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to enter a day index (0 to 6)
            System.out.print("Enter a day index (0 to 6): ");
            int dayIndex = scanner.nextInt();

            // Try to access the corresponding day name
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception if the day index is out of range (0 to 6)
            System.out.println("Error: Invalid day index. Please enter a number between 0 and 6.");
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
}
