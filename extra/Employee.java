// Employee.java
public class Employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor to initialize instance variables
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); // Using setter to validate the salary
    }

    // Getter and setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        // Set monthly salary only if it's positive
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to increase the salary by a percentage (like a 10% raise)
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.monthlySalary += this.monthlySalary * (percentage / 100);
        }
    }

    // Main test application
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("John", "Doe", 3000.00);
        Employee emp2 = new Employee("Jane", "Smith", 4000.00);

        // Display initial yearly salary for each employee
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.printf("Yearly Salary: $%.2f%n", emp1.getYearlySalary());

        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
        System.out.printf("Yearly Salary: $%.2f%n", emp2.getYearlySalary());

        // Give each employee a 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display yearly salary after the raise
        System.out.println("\nAfter 10% raise:");
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.printf("Yearly Salary: $%.2f%n", emp1.getYearlySalary());

        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
        System.out.printf("Yearly Salary: $%.2f%n", emp2.getYearlySalary());
    }
}
