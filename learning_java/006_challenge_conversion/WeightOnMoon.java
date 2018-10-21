/*
Compute my effective weight on the moon
assuming the moon's gravitational pull is
16.5% compared to earh's gravitational pull.
*/

class WeightOnMoon {
    public static void main(String args[]) {
        double my_weight_on_earth = 62.0; // in kilograms
        double moonGravity = 0.165; // percent in decimal
        double my_weight_on_moon = my_weight_on_earth * moonGravity;

        System.out.println("My weight on Moon is: " + my_weight_on_moon + "Kg");
    }
}