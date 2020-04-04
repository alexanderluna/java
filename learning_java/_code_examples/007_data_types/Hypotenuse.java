/*
Calculate the Hypotenuse of
a triangle given the size of
the other two sides.
*/

class Hypotenuse {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);
        System.out.println("The Hypotenuse is: " + z);
    }
}