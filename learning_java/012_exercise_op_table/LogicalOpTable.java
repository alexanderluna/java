/*
Generate an Operator Table
*/

class LogicalOpTable {
    public static void main(String args[]) {
        boolean a, b;

        System.out.println("(A)\t\t(B)\t\t(AND)\t(OR)\t(XOR)\t(NOT)");

        a = b = true;
        System.out.print(a + "\t" + b + "\t");
        System.out.print((a & b) + "\t" + (a | b) + "\t");
        System.out.println((a ^ b) + "\t" + (!a));

        a = true;
        b = false;
        System.out.print(a + "\t" + b + "\t");
        System.out.print((a & b) + "\t" + (a | b) + "\t");
        System.out.println((a ^ b) + "\t" + (!a));

        a = false;
        b = true;
        System.out.print(a + "\t" + b + "\t");
        System.out.print((a & b) + "\t" + (a | b) + "\t");
        System.out.println((a ^ b) + "\t" + (!a));

        a = b = false;
        System.out.print(a + "\t" + b + "\t");
        System.out.print((a & b) + "\t" + (a | b) + "\t");
        System.out.println((a ^ b) + "\t" + (!a));
    }
}