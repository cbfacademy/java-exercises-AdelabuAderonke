package com.cbfacademy;

public class App {
  public static void main(String[] args) {

  }

  // Using Merge sort
  public void mergeSort(int[] arr, int left, int right) {

    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }

  public void merge(int[] arr, int left, int right, int mid) {
    //sizes of the sub arrays
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

  }
}