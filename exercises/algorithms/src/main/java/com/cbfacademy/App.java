package com.cbfacademy;

public class App {
  public static void main(String[]args){
    String[] arr ={"in", "to","me","go"};
    System.out.println(linearSearch(arr, "hu"));
  }

  //using Linear Search
  public static String linearSearch(String[] arr, String searchString){
    for(int i=0; i < arr.length;i++){
      if(arr[i] == searchString){
        return "String found in index"+ i;
      }
    }
    return "String not found";
  }
}
  