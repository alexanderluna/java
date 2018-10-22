/*
Demonstrate why a short circuit
operator is not always the best
option
*/

class FailedShortCircuitDemo {
    public static void main(String args[]) {
        int i;
        i = 0;

        // i is incremented despited being falsy
        if (false & (++i < 100)) {
            System.out.println("This will not be printed");
        }

        // i is not incremented
        if (false && (++i < 100)) {
            System.out.println("This will not be printed");
        }
    }
}