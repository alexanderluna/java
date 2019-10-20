// some string operations

class StringOperation {
  public static void main(String args[]) {
    String first = "This is my first string";
    String second = new String(first);
    String third = "This is my third string";

    System.out.println("Length of the first string: " + first.length());
    for (int i = 0; i < first.length(); i++) {
      System.out.print(first.charAt(i));
    }
    System.out.println();

    if (first.equals(second)) {
      System.out.println("The first and second string are equal");
    } else {
      System.out.println("The first and second string are NOT equal");
    }

    if (first.equals(third)) {
      System.out.println("The first and third string are equal");
    } else {
      System.out.println("The first and third string are NOT equal");
    }

    int result = first.compareTo(third);
    if (result == 0) {
      System.out.println("The first and third string are equal");
    } else if (result < 0) {
      System.out.println("The first string is smaller than the third string");
    } else {
      System.out.println("The first string is greater than the third string");
    }

    second = "My new string in a new sentence.";
    int index = second.indexOf("new");
    System.out.println("The index of the first occurence of 'new': " + index);
    index = second.lastIndexOf("new");
    System.out.println("The index of the last occurence of 'new': " + index);
  }
}