/*
A class to generate objects
and trigger the garbage collector
*/

class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Removing: " + x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}