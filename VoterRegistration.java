// Custom Exception for Invalid Age
class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

// Voter class with voterId, name, and age
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor with age validation
    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        this.voterId = voterId;
        this.name = name;
        setAge(age);  // Using the setter to apply validation
    }

    // Setter method for age with validation
    public void setAge(int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("Invalid age for voter. Age must be 18 or above.");
        }
        this.age = age;
    }

    // Getter methods
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display Voter details
    public void displayVoterInfo() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to test Voter class
public class VoterRegistration {
    public static void main(String[] args) {
        try {
            // Create a Voter object
            Voter voter1 = new Voter(101, "Ramesh", 17);  // This will throw an exception
            voter1.displayVoterInfo();  // This won't be executed

        } catch (InvalidAgeForVoterException e) {
            // Handle the exception if age is less than 18
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create another Voter object with a valid age
            Voter voter2 = new Voter(102, "Kumar", 20);
            voter2.displayVoterInfo();  // This will be executed

        } catch (InvalidAgeForVoterException e) {
            // Handle the exception if age is less than 18
            System.out.println("Error: " + e.getMessage());
        }
    }
}

