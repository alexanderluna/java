import java.io.IOException;

/*
Take user input to display
helpful information about
java control statements
*/

class Help {
    public static void main(String[] args) throws IOException {
        char response;

        System.out.println("Pick what you need help with:");
        System.out.println("\t1. if statements\n\t2. switch statements");

        response = (char) System.in.read();

        switch (response) {
        case '1':
            System.out.println("if (condition) {");
            System.out.println("\t// do something");
            System.out.println("} else if (condition) {");
            System.out.println("\t// do something else");
            System.out.println("} else {");
            System.out.println("\t// handle all fails");
            System.out.println("}");
            break;
        case '2':
            System.out.println("switch (expression) {");
            System.out.println("\tcase match1:");
            System.out.println("\t\t//do something");
            System.out.println("\t\tbreak");
            System.out.println("\tcase match2:");
            System.out.println("\t\t//do something");
            System.out.println("\t\tbreak");
            System.out.println("\tdefault:");
            System.out.println("\t\t// all matches");
        default:
            System.out.println("Couldn't find documention for that command");
        }
    }
}