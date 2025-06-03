class ParkingSystem {
    private int bigSlots;
    private int mediumSlots;
    private int smallSlots;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
            case 1: // Big car
                if (bigSlots > 0) {
                    bigSlots--;
                    return true;
                }
                break;
            case 2: // Medium car
                if (mediumSlots > 0) {
                    mediumSlots--;
                    return true;
                }
                break;
            case 3: // Small car
                if (smallSlots > 0) {
                    smallSlots--;
                    return true;
                }
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // true
        System.out.println(parkingSystem.addCar(2)); // true
        System.out.println(parkingSystem.addCar(3)); // false
        System.out.println(parkingSystem.addCar(1)); // false
    }
}