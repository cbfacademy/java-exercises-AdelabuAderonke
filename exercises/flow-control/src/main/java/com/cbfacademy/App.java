package com.cbfacademy;

import java.util.Arrays;
import java.util.Scanner;

import com.cbfacademy.FlowControlExercises;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        FlowControlExercises flowControlExercises = new FlowControlExercises();
        //System.out.println(flowControlExercises.sumOfOddsAndSumOfEvens());
        System.out.println(flowControlExercises.fizzBuzz(Arrays.asList(1,3,5,15,45,5)));
        //System.out.println(flowControlExercises.reverse({3,6,9,12,35,78,}));
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter your value");
        //int value = input.nextInt();
        //System.out.println(flowControlExercises.whichMonth(value));
    }

}
