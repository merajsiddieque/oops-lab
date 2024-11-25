package lab7;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double totalMiles = 0; 
        double totalGallons = 0; 

        while (true) 
        {
           
            System.out.print("Enter miles driven for this trip: ");
            double miles = input.nextDouble();

            if (miles == -1) {
                break; 
            }

            System.out.print("Enter gallons used for this trip: ");
            double gallons = input.nextDouble();

            if (gallons != 0) 
            {
                double milesPerGallon = miles / gallons;
                System.out.println("Miles per gallon for this trip:"+ milesPerGallon);
            } 
            else 
            {
                System.out.println("Gallons cannot be zero. Please try again.");
                continue; 
            }

            totalMiles += miles;
            totalGallons += gallons;

            if (totalGallons != 0) {
                double combinedMilesPerGallon = totalMiles / totalGallons;
                System.out.println("Combined miles per gallon for all trips:" + combinedMilesPerGallon);
            }
        }

        if (totalGallons > 0) {
            double finalCombinedMilesPerGallon = totalMiles / totalGallons;
            System.out.printf("Final combined miles per gallon for all trips:" + finalCombinedMilesPerGallon);
        } else {
            System.out.println("No trips were recorded.");
        }

        input.close();
    }
}
