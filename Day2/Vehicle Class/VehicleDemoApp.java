public class VehicleDemoApp {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2022, "Gasoline", 4, "Automatic");
        
        // Create a Truck object
        Truck myTruck = new Truck("Ford", "F-150", 2021, "Diesel", 2.5, true);

        // Demonstrate Car functionality
        System.out.println("----- Car Information -----");
        myCar.displayInfo();
        myCar.start();
        myCar.honk();
        myCar.stop();

        // Demonstrate Truck functionality
        System.out.println("\n----- Truck Information -----");
        myTruck.displayInfo();
        myTruck.start();
        myTruck.loadCargo();
        myTruck.unloadCargo();
        myTruck.stop();
    }
}