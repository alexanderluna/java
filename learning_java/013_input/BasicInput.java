import java.io.IOException;

/*
Working with CLI input at
run time
*/

class BasicInput {
    public static void main(String args[]) throws IOException {
        char a;
        System.out.println("Press a key followed by ENTER:");

        a = (char) System.in.read();

        System.out.println("You pressed: " + a);
    }
}