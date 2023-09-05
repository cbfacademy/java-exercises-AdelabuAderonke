package com.cbfacademy;

public class App {
  public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6, 7 };

    System.out.println("Original array:");
    for (int value : arr) {
      System.out.print(value+" ");
    }
    System.out.println();
    quickSort(arr, 0, arr.length - 1);

    System.out.println("\nSorted array:");
   for (int value : arr) {
      System.out.print(value +" ");
      

    }
    System.out.println();

  }

  public static void quickSort(int[] arr, int beg, int end) {
    if (beg < end) {
      int pivotIndex = partition(arr, beg, end);
      quickSort(arr, beg, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, end);
    }
  }

  public static int partition(int[] arr, int beg, int end) {
    int pivot = arr[end]; // Choose the pivot as the last element
    int pIndex = beg - 1;

    for (int i = beg; i < end; i++) {
      if (arr[i] < pivot) {
        // Swap arr[i] and arr[pIndex+1]
        int temp = arr[i];
        arr[i] = arr[pIndex + 1];
        arr[pIndex + 1] = temp;
        pIndex++;
      }
    }

    int temp = arr[end];
    arr[end] = arr[pIndex + 1];
    arr[pIndex + 1] = temp;

    return pIndex + 1;
  }

}
