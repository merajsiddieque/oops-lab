import java.util.Scanner;

public class DailyDrivingCostCalculator {

    // Method to calculate the daily driving cost
    public static double calculateDailyCost(double milesPerDay, double costPerGallon, double milesPerGallon,
            double feesPerDay, double tollsPerDay) {
        // Calculate fuel cost
        double fuelCostPerDay = (milesPerDay / milesPerGallon) * costPerGallon;
        // Calculate total cost
        return fuelCostPerDay + feesPerDay + tollsPerDay;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.println("Enter total miles driven per day: ");
        double milesPerDay = scanner.nextDouble();

        System.out.println("Enter the cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.println("Enter the fuel efficiency (miles per gallon): ");
        double milesPerGallon = scanner.nextDouble();

        System.out.println("Enter the average fees per day (such as parking): ");
        double feesPerDay = scanner.nextDouble();

        System.out.println("Enter the tolls per day: ");
        double tollsPerDay = scanner.nextDouble();

        // Calculate the daily cost
        double totalCostPerDay = calculateDailyCost(milesPerDay, costPerGallon, milesPerGallon, feesPerDay,
                tollsPerDay);

        // Display the result
        System.out.printf("Your daily driving cost is: $%.2f%n", totalCostPerDay);

        scanner.close();
    }
}
