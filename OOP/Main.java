
public class Main {

    public static void main(String[] args) {
        VehiclesShowroom showroom = new VehiclesShowroom();

        showroom.addVehicle(new Car("Sedan", 20000, "Black", "Petrol", 220));
        showroom.addVehicle(new Car("Coupe", 26500, "Blue", "Electric", 180));
        showroom.addVehicle(new Car("Hatchback", 15000, "Green", "Diesel", 180));

        showroom.addVehicle(new Truck("TruckOne", 30000, 5000, 8));
        showroom.addVehicle(new Truck("TruckTwo", 45000, 8000, 16));

        Car speedie = new SportsCar("Speedie", 62000, "Red", "Petrol", 360);
        Car speedo = new SportsCar("Speedo", 55000, "Blue", "Petrol", 540, 60, true);

        showroom.addVehicle(speedie);
        showroom.addVehicle(speedo);

        showroom.addVehicle(new Bike("BikeOne", 10000, true, "Road"));
        showroom.addVehicle(new Bike("BikeTwo", 12000, false, "Mountain"));

        // Displaying all vehicles

        System.out.println("All Vehicles in Showroom:");
        showroom.displayAllVehiclesInfo();

        // Searching for vehicles by type (e.g., SportsCar)
        System.out.println("Searching for Sports Cars:");
        showroom.searchVehiclesByType(SportsCar.class).forEach(v -> System.out.println(v.getName()));

        // Searching for a specific vehicle by name and displaying its info
        System.out.println("Searching for a specific car by name 'Sedan':");
        Vehicle sedan = showroom.searchVehicleByName("Sedan");
        if (sedan != null) {
            ((Car) sedan).displayCarInfo();
        }

        // Buying a vehicle
        System.out.println("\nAttempting to buy 'Speedo' with $55000:");
        showroom.buyVehicle("Speedo", 55000);
        System.out.println("\nAttempting again to buy 'Speedo' with $55000:");
        showroom.buyVehicle("Speedo", 55000);

        // Attempting to buy a vehicle without enough funds
        System.out.println("\nAttempting to buy 'Speedie' with $50000:");
        showroom.buyVehicle("Speedie", 50000);

        // Displaying all vehicles after a purchase
        System.out.println("All Vehicles in Showroom after purchase:");
        showroom.displayAllVehiclesInfo();

        startRace((SportsCar) speedie, (SportsCar) speedo);
    }

    public static void startRace(SportsCar car1, SportsCar car2) {
        System.out.println("The race between " + car1.getName() + " and " + car2.getName() + " begins!");

        // Starting engines
        car1.start();
        car2.start();

        // Changing gears
        car1.changeGear(1);
        car2.changeGear(2);
        System.out.println("Both cars have stormed out of the starting line!");

        // Enabling turbo for a mid-race boost
        System.out.println(car1.getName() + " enables turbo!");
        car1.enableTurbo();
        car1.displayPerformance();

        System.out.println(car2.getName() + " enables turbo!");
        car2.enableTurbo();
        car2.displayPerformance();

        // Deciding the winner based on acceleration time (simplified)
        double car1Performance = car1.getAccelerationTime() * (car1.isTurboEnabled() ? 0.9 : 1);
        double car2Performance = car2.getAccelerationTime() * (car2.isTurboEnabled() ? 0.9 : 1);

        if (car1Performance < car2Performance) {
            System.out.println(car1.getName() + " wins the race with a stunning performance!");
        } else if (car1Performance > car2Performance) {
            System.out.println(car2.getName() + " wins the race with a stunning performance!");
        } else {
            System.out.println("It's a tie! Both cars showed exceptional performance!");
        }
    }
}
