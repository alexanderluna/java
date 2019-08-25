// Find minium and maximum values in an array

class MinMax {
  public static void main(String args[]) {
    int nums[] = { 99, -10, 5, -340, 50 };
    int min, max;

    min = max = nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }

      if (nums[i] > max) {
        max = nums[i];
      }
    }

    System.out.println("min is: " + min + "\nmax is: " + max);
  }
}