/*
Use the Vehicle class to create
an instance of Vehicle and
manipulate its fields.
*/

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Vehicle minivan = new Vehicle();

        int range1, range2;

        car.passanger = 4;
        car.fuelcap = 9;
        car.mpg = 25;

        minivan.passanger = 8;
        minivan.fuelcap = 15;
        minivan.mpg = 21;

        range1 = car.range();
        range2 = minivan.range();

        System.out.println("Car range: " + range1);
        System.out.println("Minivan range: " + range2);

        System.out.println(car.information("Car"));
        System.out.println(minivan.information("Minivan"));
    }
}