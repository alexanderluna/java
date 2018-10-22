/*
Demonstrate a failed
Type conversion
*/

class FailedConversion {
    public static void main(String args[]) {
        long a;
        double b;

        b = 100000000.0;
        a = b; // no conversion from long to double

        System.out.println("A and B: " + a + "(a) " + b + "(b)");
    }
}