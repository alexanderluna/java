// implement Queue class

class QueueDemo {
  public static void main(String args[]) {
    Queue bigQueue = new Queue(100);
    Queue smallQueue = new Queue(4);
    char character;
    int index;

    System.out.println("Using bigQueue to store the alphabet.");
    for (index = 0; index < 26; index++) {
      bigQueue.put((char) ('A' + index));
    }

    System.out.println("Contents of bigQueue:");
    for (index = 0; index < 26; index++) {
      character = bigQueue.get();
      if (character != (char) 0) {
        System.out.print(character);
      }
    }

    System.out.println("\n\nUsing smallQueue to generate errors.");
    for (index = 0; index < 5; index++) {
      System.out.print("Attempting to store " + (char) ('Z' - index));
      smallQueue.put((char) ('Z' - index));
      System.out.println();
    }

    System.out.println("Contents of smallQueue:");
    for (index = 0; index < 5; index++) {
      character = smallQueue.get();
      if (character != (char) 0) {
        System.out.print(character);
      }
    }

  }
}