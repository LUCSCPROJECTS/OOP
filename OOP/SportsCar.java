
public class SportsCar extends Car {
    private double accelerationTime; // Time to accelerate from 0 to 100 km/h in seconds
    private boolean turboEnabled;

    // Assuming the Car class has these constructors

    public SportsCar(String name, double price, String color, String fuelType, int maxSpeed) {
        super(name, price, color, fuelType, maxSpeed);
        this.accelerationTime = 80;
        this.turboEnabled = false;
    }

    public double getAccelerationTime() {
        return accelerationTime;
    }

    // Additional methods specific to SportsCar
    public void enableTurbo() {
        turboEnabled = true;
    }

    public void setAccelerationTime(double accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    public void setTurboEnabled(boolean turboEnabled) {
        this.turboEnabled = turboEnabled;
    }

    public SportsCar(String name, double price, String color, String fuelType, int maxSpeed, int accelerationTime, boolean turboEnabled) {
        super(name, price, color, fuelType, maxSpeed);
        this.accelerationTime = accelerationTime;
        this.turboEnabled = turboEnabled;
    }

    public SportsCar(String name, double price, String color, String fuelType, int maxSpeed, int accelerationTime) {
        super(name, price, color, fuelType, maxSpeed); // Call the constructor of the parent class (Car)
        this.accelerationTime = accelerationTime;
        this.turboEnabled = false; // Turbo is off by default
    }


    public void disableTurbo() {
        turboEnabled = false;
    }

    public boolean isTurboEnabled() {
        return turboEnabled;
    }

    // Adjust the acceleration time based on whether the turbo is enabled
    public void displayPerformance() {
        double adjustedAccelerationTime = turboEnabled ? accelerationTime * 0.9 : accelerationTime;
        System.out.println("Acceleration (0 to 100 km/h): " + adjustedAccelerationTime + " seconds with turbo " + (turboEnabled ? "enabled" : "disabled"));
    }

    // Overriding the displayCarInfo method to include top speed and turbo status
    // Polymorphism
    @Override
    public void displayCarInfo() {
        super.displayCarInfo(); // Call the displayCarInfo method of the parent class
        System.out.println("Acceleration Time (0 to 100 km/h): " + getAccelerationTime() + " seconds");
        String turboStatus = turboEnabled ? "enabled" : "disabled";
        System.out.println("Turbo: " + turboStatus);
    }
}
