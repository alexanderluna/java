/*
Automatically convert compatible
types as long as the destination
is larger than the source
*/

class AutomaticConversion {
    public static void main(String args[]) {
        long a;
        double b;

        a = 123456789L;
        b = a;

        System.out.println("A and B: " + a + "(a) " + b + "(b)");
    }
}