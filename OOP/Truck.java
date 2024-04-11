
public class Truck extends Vehicle {
    private int loadCapacity; // in kilograms
    private int numberOfAxles;

    public Truck(String name, double price, int loadCapacity, int numberOfAxles) {
        super(name, price);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void start() {
        System.out.println(getName() + " truck started.");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void stop() {
        System.out.println(getName() + " truck stopped.");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println(getName() + " truck changed to gear " + gear + ".");
    }

    public void displayTruckInfo() {
        System.out.println("Truck Name: " + getName() + ", Load Capacity: " + loadCapacity + "kg, Number of Axles: " + numberOfAxles);
        System.out.println("    - Price : " + getPrice() + " $");
    }

    // Unique method for Truck
    public void checkLoadSecurity() {
        System.out.println(getName() + " truck is checking that the load is secure.");
    }
}
