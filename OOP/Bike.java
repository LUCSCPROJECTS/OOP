
public class Bike extends Vehicle {
    private boolean isElectric; // Example of an additional attribute specific to Bike
    private String type; // e.g., "Mountain", "Road", "Hybrid"

    public Bike(String name, double price, boolean isElectric, String type) {
        super(name, price);
        this.isElectric = isElectric;
        this.type = type;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(getName() + " bike started moving.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " bike stopped.");
    }

    @Override
    public void changeGear(int gear) {
        if (isElectric) {
            System.out.println(getName() + " is electric and does not change gears.");
        } else {
            System.out.println(getName() + " changes to gear " + gear + ".");
        }
    }

    public void displayBikeInfo() {
        System.out.println("Bike Name: " + getName() + ", Type: " + type + ", Is Electric: " + (isElectric ? "Yes" : "No"));
        System.out.println("    - Price : " + getPrice() + " $");
    }

    // Unique method for Bike
    public void adjustSeatHeight(String height) {
        System.out.println(getName() + " bike's seat height adjusted to " + height + ".");
    }
}
