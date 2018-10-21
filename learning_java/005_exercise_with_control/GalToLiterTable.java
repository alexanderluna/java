/* 
Print a conversion table from Gallon to Liter, example:

1.0 gallons is 3.7854 liters.
2.0 gallons is 7.5708 liters.
*/
class GalToLiterTable {
    public static void main(String args[]) {
        double liters;

        for (double gallons = 1; gallons <= 100; gallons++) {

            liters = gallons * 3.7854;

            System.out.println(gallons + " gallons is " + liters + " liters.");

            if (gallons % 10 == 0) {
                System.out.println();
            }
        }
    }
}