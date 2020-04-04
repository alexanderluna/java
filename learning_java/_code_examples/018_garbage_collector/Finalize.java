/*
Use the FDemo class and
generate objects to
visualize the finalize method.
*/

class Finalize {
    public static void main(String[] args) {
        FDemo ob = new FDemo(0);

        for (int count = 1; count < 100000; count++) {
            ob.generator(count);
        }
    }
}