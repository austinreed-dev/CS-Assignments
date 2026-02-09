// No package declaration needed if they are in the same folder
public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default Constructor
    public Automobile() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized Constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Error in Constructor: " + e.getMessage());
        }
    }

    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "SUCCESS: Vehicle added.";
        } catch (Exception e) {
            return "FAILURE: " + e.getMessage();
        }
    }

    public String[] listVehicle() {
        try {
            return new String[] {make, model, color, String.valueOf(year), String.valueOf(mileage)};
        } catch (Exception e) {
            return new String[] {"FAILURE: " + e.getMessage()};
        }
    }

    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "SUCCESS: Vehicle removed.";
        } catch (Exception e) {
            return "FAILURE: " + e.getMessage();
        }
    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "SUCCESS: Vehicle updated.";
        } catch (Exception e) {
            return "FAILURE: " + e.getMessage();
        }
    }
}