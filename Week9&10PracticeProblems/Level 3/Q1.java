import java.util.Scanner;

/**
 * Q1: BMI Calculator for a team of 10 members using 2D arrays.
 * @author Reeju Banerjee
 * @version 1.0
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] measurements = new double[10][2];

        // Step a: Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            measurements[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            measurements[i][1] = sc.nextDouble();
        }

        // Step c: Process data to get BMI and Status
        String[][] results = processBMI(measurements);

        // Step d: Display in tabular format
        displayTable(results);
    }

    /**
     * Step b: Computes BMI and determines status based on weight and height.
     * Note: Converts height from cm to meters.
     */
    static String[] getBMIAndStatus(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0;
        double bmi = weight / (heightMeters * heightMeters);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Returning as String array: [BMI_Value, Status]
        return new String[]{String.format("%.2f", bmi), status};
    }

    /**
     * Step c: Creates a 2D String array storing Height, Weight, BMI, and Status.
     */
    static String[][] processBMI(double[][] data) {
        String[][] results = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = getBMIAndStatus(weight, height);

            results[i][0] = String.valueOf(height);
            results[i][1] = String.valueOf(weight);
            results[i][2] = bmiInfo[0];
            results[i][3] = bmiInfo[1];
        }
        return results;
    }

    /**
     * Step d: Displays the 2D string array in a tabular format.
     */
    static void displayTable(String[][] results) {
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        System.out.println("------------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("------------------------------------------------------------");
    }
}