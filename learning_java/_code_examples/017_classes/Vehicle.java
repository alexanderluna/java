/*
Define the vehicle class
*/

class Vehicle {
    int passanger;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;
    }

    String information(String vehicleType) {
        return String.format("%s can carry %d with a range of %d", vehicleType, passanger, range());
    }
}