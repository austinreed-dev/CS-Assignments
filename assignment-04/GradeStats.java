import java.util.Scanner;

public class GradeStats {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        double total = 0;
        double max = -1.0; // Grades won't be below 0
        double min = 101.0; // Grades won't be above 100
        
        System.out.println("--- Class Grade Entry (10 Grades) ---");

        // Requirement: Utilize a for-loop for ten floating-point grades
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade #" + i + ": ");
            
            // Basic check to ensure we have a valid number
            if (sc.hasNextDouble()) {
                double currentGrade = sc.nextDouble();
                
                total += currentGrade;
                
                // Track Maximum
                if (currentGrade > max) {
                    max = currentGrade;
                }
                
                // Track Minimum
                if (currentGrade < min) {
                    min = currentGrade;
                }
            } else {
                System.out.println("Invalid input. Please restart and enter numbers.");
                return;
            }
        }

        double average = total / 10;

        // Output results
        System.out.println("\n--- Grade Statistics ---");
        System.out.printf("Class Average: %.2f\n", average);
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);
        
        sc.close();
    }
}