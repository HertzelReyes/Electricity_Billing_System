/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eheh;

/**
 *
 * @author Hp
 */
public class Eheh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Power ratings of the appliances in watts
        final int AIRCON_WATTS = 1500;
        final int FAN_WATTS = 75;
        final int LAPTOP_WATTS = 50;
        final int PHONE_CHARGER_WATTS = 5;
        final int RICE_COOKER_WATTS = 700;
        final int LAMP_WATTS = 40;
        
        // Cost of electricity in pesos per kWh
        final double COST_PER_KWH = 12.0;
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the daily usage in hours for each appliance
        System.out.print("Enter the number of hours per day the aircon is used: ");
        double airconHours = scanner.nextDouble();
        
        System.out.print("Enter the number of hours per day the electric fan is used: ");
        double fanHours = scanner.nextDouble();
        
        System.out.print("Enter the number of hours per day the laptop is used: ");
        double laptopHours = scanner.nextDouble();
        
        System.out.print("Enter the number of hours per day the phone charger is used: ");
        double phoneChargerHours = scanner.nextDouble();
        
        System.out.print("Enter the number of hours per day the rice cooker is used: ");
        double riceCookerHours = scanner.nextDouble();
        
        System.out.print("Enter the number of hours per day the lamp is used: ");
        double lampHours = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Calculate the monthly consumption for each appliance
        double airconConsumption = calculateMonthlyConsumption(AIRCON_WATTS, airconHours);
        double fanConsumption = calculateMonthlyConsumption(FAN_WATTS, fanHours);
        double laptopConsumption = calculateMonthlyConsumption(LAPTOP_WATTS, laptopHours);
        double phoneChargerConsumption = calculateMonthlyConsumption(PHONE_CHARGER_WATTS, phoneChargerHours);
        double riceCookerConsumption = calculateMonthlyConsumption(RICE_COOKER_WATTS, riceCookerHours);
        double lampConsumption = calculateMonthlyConsumption(LAMP_WATTS, lampHours);
        
        // Calculate the total monthly cost
        double totalConsumptionKWh = airconConsumption + fanConsumption + laptopConsumption +
                                     phoneChargerConsumption + riceCookerConsumption + lampConsumption;
        double totalCost = totalConsumptionKWh * COST_PER_KWH;
        
        // Print the results
        System.out.printf("Total monthly consumption: %.2f kWh%n", totalConsumptionKWh);
        System.out.printf("Total monthly cost: %.2f pesos%n", totalCost);
    }
    
    /**
     * Calculates the monthly energy consumption in kWh for a given appliance.
     *
     * @param powerRating The power rating of the appliance in watts.
     * @param hoursPerDay The number of hours per day the appliance is used.
     * @return The monthly energy consumption in kWh.
     */
    private static double calculateMonthlyConsumption(int powerRating, double hoursPerDay) {
        double dailyConsumptionKWh = (powerRating * hoursPerDay) / 1000.0;
        return dailyConsumptionKWh * 30; // 30 days in a month
    }
}
