/*
Calculate the factor of
numbers from 0 to 100
using two for loops
*/

class FactorOfNumbers {
    public static void main(String args[]) {
        for (int factorOf = 2; factorOf < 20; factorOf++) {
            System.out.print("Factor of " + factorOf + " is: ");
            for (int factor = 2; factor < factorOf; factor++) {
                if (factorOf % factor == 0) {
                    System.out.print(factor + " ");
                }
            }
            System.out.println();
        }
    }
}