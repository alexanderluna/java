// A queue class implementation

class Queue {

  char queue[];
  int putLocation, getLocation;

  Queue(int size) {
    queue = new char[size];
    putLocation = getLocation = 0;
  }

  void put(char character) {
    if (putLocation == queue.length) {
      System.out.println(" - Queue is full.");
      return;
    }
    queue[putLocation++] = character;
  }

  char get() {
    if (getLocation == putLocation) {
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }
    return queue[getLocation++];
  }
}