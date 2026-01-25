import java.util.Scanner;

public class TempStats {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
            double[] temps = new double[12];
            
            // 1. Data Entry
            for (int i = 0; i < 12; i++) {
                System.out.print("Enter average temperature for " + months[i] + ": ");
                temps[i] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consume newline
            
            // 2. Query
            System.out.print("\nEnter a month name to view, or type 'year' for the full report: ");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("year")) {
                double total = 0;
                double high = temps[0];
                double low = temps[0];
                
                System.out.println("\n--- Yearly Temperature Report ---");
                for (int i = 0; i < 12; i++) {
                    System.out.printf("%-10s: %.2f°\n", months[i], temps[i]);
                    total += temps[i];
                    if (temps[i] > high) high = temps[i];
                    if (temps[i] < low) low = temps[i];
                }
                System.out.printf("\nYearly Average: %.2f°", (total / 12));
                System.out.println("\nHighest Month:  " + high + "°");
                System.out.println("Lowest Month:   " + low + "°");
                
            } else {
                boolean found = false;
                for (int i = 0; i < 12; i++) {
                    if (months[i].equalsIgnoreCase(choice)) {
                        System.out.println(months[i] + " Average Temperature: " + temps[i] + "°");
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Error: Month not recognized.");
            }
        }
    }
}