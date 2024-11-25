// Date.java
public class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor to initialize the instance variables
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters and getters for month
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    // Setters and getters for day
    public void setDay(int day) {
        this.day = day;

    }

    public int getDay() {
        return day;
    }

    // Setters and getters for year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Method to display the date in the format month/day/year
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    // DateTest class
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(9, 11, 2024);

        // Display the initial date
        System.out.print("The date is: ");
        date.displayDate();

        // Test the set methods
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2023);

        // Display the updated date
        System.out.print("After updating, the date is: ");
        date.displayDate();
    }
}
