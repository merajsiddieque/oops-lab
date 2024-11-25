package lab6;

public class Employee {
 private String firstName;
 private String lastName;
 private double monthlySalary;

 public Employee(String firstName, String lastName, double monthlySalary) {
     this.firstName = firstName;
     this.lastName = lastName;
     setMonthlySalary(monthlySalary); 
 }

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }

 public double getMonthlySalary() {
     return monthlySalary;
 }

 public void setMonthlySalary(double monthlySalary) {
     if (monthlySalary > 0) {
         this.monthlySalary = monthlySalary;
     } else {
         this.monthlySalary = 0.0;
     }
 }

 public double getYearlySalary() {
     return monthlySalary * 12;
 }

 public void hike(double percentage) {
     if (percentage > 0) {
         this.monthlySalary = this.monthlySalary+( this.monthlySalary * (percentage / 100));
     }
 }

 public static void main(String[] args) {
     Employee emp1 = new Employee("Meraj", "Alam", 3000);
     Employee emp2 = new Employee("Mihir", "Hajare", 4000);

     System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
     System.out.printf("Yearly Salary:₹" + emp1.getYearlySalary() + "\n\n");

     System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
     System.out.printf("Yearly Salary:₹" + emp2.getYearlySalary() + "\n");

     emp1.hike(10);
     emp2.hike(10);

     System.out.println("\nAfter 10% hike:\n");
     System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
     System.out.printf("Yearly Salary:₹" + emp1.getYearlySalary() + "\n\n");

     System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
     System.out.printf("Yearly Salary:₹" + emp2.getYearlySalary() + "\n");
 }
}
