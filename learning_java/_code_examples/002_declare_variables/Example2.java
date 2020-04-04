class Example2 {
    public static void main(String args[]) {
        // Working with basic variables
        int var1;
        int var2;

        var1 = 1024;
        System.out.println("Var1 has value: " + var1);

        var2 = var1 / 2;
        System.out.println("Var2 has value (Var1 / 2): " + var2);

        // Working with floating point numbers
        int var;
        double x;

        var = 10;
        x = 10.0;
        System.out.println("Int original value: " + var);
        System.out.println("Double original value: " + x);

        var = var / 4;
        x = x / 4;

        System.out.println("Int divided value: " + var);
        System.out.println("Double divide value:" + x);
    }
}