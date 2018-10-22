/*
Demonstrate how casting allows
us to convert between incompatible
types with the risk of losing information
*/

class CastingDemo {
    public static void main(String args[]) {
        double a, b;
        byte c;
        int d;
        char e;

        a = 10.0;
        b = 3.0;

        d = (int) (a / b);
        System.out.println("Integer outcome of double divsion: " + d);

        d = 100;
        c = (byte) d; // no loss
        System.out.println("Integer conversion to Byte: " + c);

        d = 257;
        c = (byte) d; // loss because 257 is too big for byte
        System.out.println("Integer conversion to Byte: " + c);

        c = 88;
        e = (char) c;
        System.out.println("Byte conversion to char: " + e);

    }
}