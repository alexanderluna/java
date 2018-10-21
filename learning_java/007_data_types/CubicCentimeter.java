/*
Number of Cubic centimeters in
1 Cubic meter
*/

class CubicCentimeter {
    public static void main(String args[]) {
        long cubic_cm;
        long cm_in_m;

        cm_in_m = 100;
        cubic_cm = cm_in_m * cm_in_m * cm_in_m;

        System.out.println("There are " + cubic_cm + " cm³ in 1m³");
    }
}
