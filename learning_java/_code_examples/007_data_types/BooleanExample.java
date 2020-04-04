/*
Basic Boolean value usage
*/

class BooleanExample {
    public static void main(String args[]) {
        boolean over20;

        over20 = false;
        System.out.println("Is this person over 20 ? " + over20);

        over20 = true;
        if (over20) {
            System.out.println("This person is over 20");
        }
    }
}