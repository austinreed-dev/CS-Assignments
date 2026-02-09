import java.io.*;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // 1. Using Parameterized Constructor
            Automobile myAuto = new Automobile("Toyota", "Supra", "Black", 2024, 500);
            
            System.out.println("--- Initial Listing ---");
            printListing(myAuto.listVehicle());

            // 2. Remove Vehicle
            System.out.println("\n--- Removing Vehicle ---");
            System.out.println(myAuto.removeVehicle());

            // 3. Add New Vehicle
            System.out.println("\n--- Adding New Vehicle ---");
            System.out.println(myAuto.addVehicle("Honda", "Civic", "Red", 2023, 12000));
            printListing(myAuto.listVehicle());

            // 4. Update Vehicle
            System.out.println("\n--- Updating Vehicle ---");
            System.out.println(myAuto.updateVehicle("Honda", "Civic", "Blue", 2023, 12500));
            printListing(myAuto.listVehicle());

            // 5. File Output Prompt
            System.out.print("\nPrint results to file? (Y/N): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                saveToFile(myAuto.listVehicle());
            } else {
                System.out.println("File print skipped.");
            }

        } catch (Exception e) {
            System.out.println("Critical Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void printListing(String[] details) {
        for (String s : details) {
            System.out.println(s);
        }
    }

    public static void saveToFile(String[] details) {
        try (PrintWriter out = new PrintWriter(new File("Autos.txt"))) {
            for (String s : details) {
                out.println(s);
            }
            System.out.println("SUCCESS: Printed to Autos.txt");
        } catch (Exception e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}