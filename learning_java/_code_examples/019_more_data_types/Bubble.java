// Sort an array using the bubble sort algorithm

import java.util.Arrays;

class Bubble {
  public static void main(String args[]) {
    int nums[] = { 99, -10, 110000, 19, -9384, 56598, 938, -5, 234, 54 };
    int size = 10;

    System.out.println("The original array is: ");
    stringifyArray(nums);

    int[] sortedArray = bubbleSort(nums, size);
    System.out.println("The Sorted Array is: ");
    stringifyArray(sortedArray);
  }

  public static void stringifyArray(int[] arr) {
    String arrayToString = Arrays.toString(arr);
    System.out.println(arrayToString + "\n");
  }

  public static int[] bubbleSort(int[] arr, int size) {
    for (int a = 1; a < size; a++) {
      for (int b = size - 1; b >= a; b--) {
        if (arr[b - 1] > arr[b]) {
          int t = arr[b - 1];
          arr[b - 1] = arr[b];
          arr[b] = t;
        }
      }
    }
    return arr;
  }
}