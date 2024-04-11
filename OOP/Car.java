
public class Car extends Vehicle {
    private String color;
    private String fuelType;
    private int maxSpeed;

    public Car(String name,double price, String color, String fuelType, int maxSpeed) {
        super(name,price);
        this.color = color;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getFuelType() {
        return fuelType;
    }


    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void start() {
        System.out.println(getName() + " car started.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " car stopped.");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println(getName() + " car changed to gear " + gear + ".");
    }

    public void displayCarInfo() {
        System.out.println("Car Name: " + getName() + ", Color: " + color + ", Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h");
        System.out.println("    - Price : " + getPrice() + " $");
    }

    // Unique method for Car
    public void activateCruiseControl() {
        System.out.println(getName() + " car's cruise control activated. Maintaining current speed.");
    }
}


