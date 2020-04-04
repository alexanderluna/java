import java.io.IOException;

/*
A simple guess the letter
game using the input
*/

class InputGame {
    public static void main(String args[]) throws IOException {
        char a;
        char answer = 'A';

        System.out.println("Guess the letter between A-Z:");

        a = (char) System.in.read();

        if (a == answer) {
            System.out.println("You guessed it");
        } else {
            System.out.print("You are wrong. ");
            if (a < answer) {
                System.out.println("You guessed too low");
            } else {
                System.out.println("You gussed too high");
            }
        }
    }
}