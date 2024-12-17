package OOPS.ClassAndObject;

public class car {
    //properties
    int noOfWheels;            // Number of wheels the car has
    String color;              // Color of the car
    float maxSpeed;            // Maximum speed of the car
    float currentFuelInLiter;  // Current fuel level in liters
    int noOfSeats;             // Number of seats in the car


    // Method 1 to simulate driving the car //behaviors
    public  void start(){
        if (currentFuelInLiter <= 0) {
            // Check if the car is out of fuel
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLiter < 5) {
            // If fuel is less than 5 liters, enter reserved mode
            System.out.println("Car is in reserved mode, please refuel");

        } else {
            // Normal driving mode
            System.out.println("Car is started.. bruhhh...");

        }
     return;
    }

    // Method 2
    public void driver(){
        currentFuelInLiter--;
        System.out.println("Car is driving");
    }

    // Method to add fuel to the car
    public void addFuel(float fuel) {
        currentFuelInLiter += fuel; // Increase current fuel level by the amount added
    }

    // Method to get the current fuel level
    public float getCurrentFuelLevel() {
        return currentFuelInLiter; // Return the current fuel level
    }

  //note we can call this code by another driver d

    public static void main(String[] args) {
        /*car myCar = new car();   // Create a new car object
        myCar.addFuel(6);        // Add 6 liters of fuel to the car
        myCar.driver();          // Drive the car (first time)
        myCar.driver();          // Drive the car (second time)
        myCar.driver();          // Drive the car (third time)
        myCar.addFuel(0);        // Add 0 liters of fuel (no change)
        myCar.driver();          // Drive the car (fourth time)
        System.out.println(myCar.getCurrentFuelLevel()); // Print the current fuel level
    */
        car swift = new car();
        swift.addFuel(6);
        swift.start();
        swift.driver();
    }

}

//notes car ia a blueprint ; object are real values