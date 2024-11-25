package lab6;


public class DailyDrivingCostCalculator {

    public static double calculateDailyCost(double milesPerDay, double costPerGallon, double milesPerGallon,
    		double feesPerDay, double tollsPerDay) 
    {
        double fuelCostPerDay = (milesPerDay / milesPerGallon) * costPerGallon;
        return fuelCostPerDay + feesPerDay + tollsPerDay;
    }

    public static void main(String[] args) {

        double totalCostPerDay = calculateDailyCost(60, 80, 90, 50,20);

        System.out.printf("Your daily driving cost is:₹" + totalCostPerDay);

    }
}


