class ControlStatement {
    public static void main(String args[]) {
        int x = 10;

        if (x < 15)
            System.out.println("X is smaller than 15");

        int count;
        for (count = 0; count < 5; count++) {
            int iteration = count + 1;
            System.out.println("This is iteration: " + iteration);
        }
    }
}