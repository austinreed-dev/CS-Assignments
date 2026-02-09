import java.util.Scanner;

public class GroceryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter coupon amount as a decimal (e.g., 0.10 for 10%): ");
        double coupon = sc.nextDouble();

        // Logic: If coupon is invalid, default to 10%
        if (coupon <= 0 || coupon > 1.0) {
            coupon = 0.10;
            System.out.println("Invalid coupon entered. Defaulting to 10%.");
        }

        double total = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter bill for Week " + i + ": ");
            total += sc.nextDouble();
        }

        double finalTotal = total * (1 - coupon);

        System.out.println("\n--- Monthly Grocery Summary ---");
        System.out.printf("Total before discount: $%.2f\n", total);
        System.out.printf("Total after %.0f%% discount: $%.2f\n", (coupon * 100), finalTotal);
        
        sc.close();
    }
}