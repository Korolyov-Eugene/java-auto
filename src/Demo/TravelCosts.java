package Demo;

import java.util.Scanner;

/**
 * Created by Ievgen_Korolov on 6/27/2017.
 */
public class TravelCosts {

    public static void main(String[] args) {
        double distance, mpg, pricePerGallon, totalCost;
        String vehicleType;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the MPG for the vehicle: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        System.out.println("Please enter the vehicle type");
        vehicleType = in.next();

        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f since you are driving " + "a " + vehicleType , totalCost);
        System.out.println();
    }
}
