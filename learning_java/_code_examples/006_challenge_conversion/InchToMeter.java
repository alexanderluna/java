/*
Print a conversion table from inches to meters
up to 12 feet with a space every 12 inches
*/

class InchToMeter {
    public static void main(String args[]) {
        short feet = 144; // in inches
        double meters;

        for (short inches = 1; inches <= feet; inches++) {
            meters = inches / 39.37;

            System.out.println(inches + " inches is " + meters + " meters");

            if (inches % 12 == 0) {
                System.out.println();
            }
        }
    }
}