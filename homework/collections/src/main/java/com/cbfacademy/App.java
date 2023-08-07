package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        CollectionsAssignment coll = new CollectionsAssignment();
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(3, 5, 3, 6, 2, 4, 9, 12, 35, 78));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(12, 1, 4, 35, 78));
        ArrayList<String> num3 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Alice", "Alice", "Jon"));
        System.out.println(coll.mostFrequent(num3));
        // List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 35, 78))
        //System.out.println(coll.removeSmallInts(num, 5));
        // coll.containsDuplicates(num);
        // System.out.println(coll.inEither(num,num2));
        // System.out.println(coll.inBoth(num,num2));
    }
}
