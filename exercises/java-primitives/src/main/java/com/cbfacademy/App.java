package com.cbfacademy;

import java.util.Scanner;

import com.cbfacademy.StringExercises;

public class App {
    public static void main(String[] args) {
        /**
         * System.out.println("Hello World!");
         * float num1 = 18.0f;
         * float num2 = 30.0f;
         * ArithmetricExercises exercises = new ArithmetricExercises();
         * System.out.println(exercises.Addition(num1, num2));
         * System.out.println(exercises.Subtraction(num1, num2));
         * System.out.println(exercises.Division(num1, num2));
         * System.out.println(exercises.Multiplication(num1, num2));
         **/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = input.next();
        System.out.println("Enter the letter you want to search for");
        char character = input.next().charAt(0);
        input.close();

        StringExercises stringExercises = new StringExercises();
        //System.out.println(stringExercises.fromCharacters(new char[]{'C', 'o', 'd', 'i', 'n', 'g'}));
        System.out.println(stringExercises.howMany(text, character));
    }
}
