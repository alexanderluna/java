/*
Demonstrate the use of
short circuit operators
*/

class ShortCircuitDemo {
    public static void main(String args[]) {
        int a, b;

        a = 10;
        b = 2;

        if (b != 0 && (a % b) == 0) {
            System.out.println(b + " is a factor of " + a);
        }

        b = 0;

        if (b != 0 && (a % b) == 0) { // short circuit prevents 0 division
            System.out.println(b + " is a factor of " + a);
        }

        if (b != 0 & (a % b) == 0) { // 0 division error
            System.out.println(b + " is a factor of " + a);
        }
    }
}