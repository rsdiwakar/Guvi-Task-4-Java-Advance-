import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {

    // HashMap to store student names (keys) and their grades (values)
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " has been removed.");
        } else {
            System.out.println("Error: Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade for " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Error: Student " + name + " not found.");
        }
    }

    // Method to display all students and their grades
    public void displayAllStudents() {
        if (studentGrades.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("List of all students and their grades:");
            for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades grades = new StudentGrades();
        int choice;

        do {
            // Display menu
            System.out.println("\nStudent Grades Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student's Grade");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter student's name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student's grade: ");
                    int gradeToAdd = scanner.nextInt();
                    grades.addStudent(nameToAdd, gradeToAdd);
                    break;

                case 2:
                    // Remove a student
                    System.out.print("Enter student's name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    grades.removeStudent(nameToRemove);
                    break;

                case 3:
                    // Display a student's grade
                    System.out.print("Enter student's name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    grades.displayGrade(nameToDisplay);
                    break;

                case 4:
                    // Display all students and their grades
                    grades.displayAllStudents();
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

