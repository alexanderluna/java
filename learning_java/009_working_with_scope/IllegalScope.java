/*
Declaring two variables with the same
name inside the scope is illegal
*/

class IllegalScope {
    public static void main(String args[]) {
        int x = 10;
        for (int y = 0; y < 5; y++) {
            int x = 20; // illegal
        }
    }
}