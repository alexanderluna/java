// turn upper case letters into lower case letters

class LowerCase {
  public static void main(String args[]) {
    char character;

    for (int i = 0; i < 10; i++) {
      character = (char) ('A' + i);
      System.out.print(character);

      character = (char) ((int) character | 32);
      System.out.print(character + " ");
    }
  }
}