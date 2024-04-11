
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehiclesShowroom {
    private List<Vehicle> vehicles = new ArrayList<>();

    // Add a new vehicle to the showroom
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Search for vehicles by type
    public List<Vehicle> searchVehiclesByType(Class<?> type) {
        return vehicles.stream()
                .filter(type::isInstance)
                .collect(Collectors.toList());
    }

    // Display information for all vehicles
    // Demonstrating polymorphism by calling a method common to all vehicles
    public void displayAllVehiclesInfo() {
        vehicles.forEach(vehicle -> {
            if (vehicle instanceof Car) {
                ((Car) vehicle).displayCarInfo();
            } else if (vehicle instanceof Truck) {
                ((Truck) vehicle).displayTruckInfo();
            } else if (vehicle instanceof Bike) {
                ((Bike) vehicle).displayBikeInfo();
            }
            System.out.println("---------------------");
        });
    }

    // Search for a car by name
    public Vehicle searchVehicleByName(String name) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Buy a car
    public Vehicle buyVehicle(String name, double amount) {
        Vehicle vehicle = searchVehicleByName(name);
        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return null;
        } else if (amount >= vehicle.getPrice()) {
            vehicles.remove(vehicle);
            System.out.println(name + " has been bought for " + vehicle.getPrice() + " and removed from the showroom.");
            return vehicle;
        } else {
            System.out.println("Insufficient funds to buy " + name + ". Required: " + vehicle.getPrice() + ", Provided: " + amount);
            return null;
        }
    }
}
