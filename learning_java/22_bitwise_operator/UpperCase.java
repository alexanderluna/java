// turn lower case letters into upper case letters

class UpperCase {
  public static void main(String args[]) {
    char character;

    for (int i = 0; i < 10; i++) {
      character = (char) ('a' + i);
      System.out.print(character);

      character = (char) ((int) character & 65503);
      System.out.print(character + " ");
    }
  }
}