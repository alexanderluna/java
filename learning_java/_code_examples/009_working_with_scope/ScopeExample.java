/*
Take a closer look at block
scope of variables.
*/

class ScopeExample {
    public static void main(String args[]) {
        int x = 10; // available in main

        if (x < 15) {
            int y = 20; // available in if statements
            System.out.println("X, Y are declared: " + x + "(x) " + y + "(y)");
        }

        System.out.println("X declared but Y fell out of scope: " + x + "(x)");
    }
}