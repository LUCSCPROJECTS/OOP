
public abstract class Vehicle implements Movable {
    private String name;
    private double price;

    public Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // Implementing the accelerate method from Movable interface with a default behavior
    @Override
    public void accelerate() {
        System.out.println(getName() + " is accelerating.");
    }

    // Abstract method specific to Vehicle subclasses
    public abstract void changeGear(int gear);

    // Concrete method common to all Vehicles
    public void honk() {
        System.out.println(getName() + " honks.");
    }
}
