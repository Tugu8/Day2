// Base Vehicle class
class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Common vehicle methods
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {
    private int numDoors;
    private String transmissionType;

    public Car(String make, String model, int year, String fuelType, 
               int numDoors, String transmissionType) {
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
        this.transmissionType = transmissionType;
    }

    // Car-specific methods
    public void honk() {
        System.out.println("Beep beep!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Transmission Type: " + transmissionType);
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double cargoCapacity;
    private boolean hasTrailer;

    public Truck(String make, String model, int year, String fuelType,
                 double cargoCapacity, boolean hasTrailer) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
        this.hasTrailer = hasTrailer;
    }

    // Truck-specific methods
    public void loadCargo() {
        System.out.println("Loading cargo into the truck.");
    }

    public void unloadCargo() {
        System.out.println("Unloading cargo from the truck.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Has Trailer: " + (hasTrailer ? "Yes" : "No"));
    }
}
