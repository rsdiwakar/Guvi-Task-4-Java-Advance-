import java.util.Scanner;

// Custom Exception for Invalid Age Range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class to hold student information and handle exceptions
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor to initialize the student object
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name);
        setAge(age);
        this.course = course;
    }

    // Method to set the name with validation for numbers and special characters
    public void setName(String name) throws NameNotValidException {
        if (name.matches(".*[0-9!@#$%^&*(),.?\":{}|<>].*")) {
            throw new NameNotValidException("Name contains invalid characters or numbers.");
        }
        this.name = name;
    }

    // Method to set the age with validation within the range of 15 to 21
    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        this.age = age;
    }

    // Getters for student attributes
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input student details
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            // Create student object with validation
            Student student = new Student(rollNo, name, age, course);

            // Display student information
            student.displayStudentInfo();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
