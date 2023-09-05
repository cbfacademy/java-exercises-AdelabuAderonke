package com.cbfacademy;

public class App {
  public static void main(String[] args) {

    int[] arr = { 12, 11, 13, 5, 6, 7 };
    System.out.print("Original Array:");
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
    mergeSort(arr, 0, arr.length - 1);
    
    System.out.print("Sorted array: ");
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println(); // Add a newline for formatting
  }

  // Using Merge sort
  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  public static void merge(int[] arr, int left, int mid, int right) {
    // sizes of the subarrays
    int first = mid - left + 1;
    int second = right - mid;

    // Create temporary arrays to hold the data
    int[] leftArray = new int[first];
    int[] rightArray = new int[second];

    // Copy data to temporary arrays leftArray[] and rightArray[]
    for (int i = 0; i < first; i++) {
      leftArray[i] = arr[left + i];
    }
    for (int j = 0; j < second; j++) {
      rightArray[j] = arr[mid + 1 + j];
    }

    // Merge the two subarrays back into the original array
    int i = 0, j = 0, k = left;
    while (i < first && j < second) {
      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of leftArray[] if any
    while (i < first) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    // Copy remaining elements of rightArray[] if any
    while (j < second) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
