/*
Demonstrate how the break
keyword can be used as a
form of goto within loops
*/

class BreakGotoLoops {
    public static void main(String args[]) {
        int x, y = 0;

        one: for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) {
                    break one;
                }
                System.out.println("X and Y: " + x + " " + y);
            }
        }

        System.out.println();

        for (x = 0; x < 5; x++)
            two: {
                for (y = 0; y < 5; y++) {
                    if (y == 2) {
                        break two;
                    }
                    System.out.println("A and B: " + x + " " + y);
                }
            }
    }
}