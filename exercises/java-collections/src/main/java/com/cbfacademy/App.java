package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] intArray = { 3, 56, 34, 2, 1, 5, 9, 7 };
        System.out.println(intArray[4]);
        float[] floatArray = { 3.3f, 56.1f, 34.0f, 2.7f, 1.7f, 5.4f, 9.0f, 7.1f, 4.6f, 3.3f, 1.2f, 2.3f };
        System.out.println(floatArray[4]);

        double[] doubleArray = { 100.3, 2.53, 56.4, 3.4, 56.3 };
        System.out.println(doubleArray[4]);

        boolean[] booleanArray = { true, false, true, true, false, true };
        System.out.println(booleanArray[4]);

        CollectionsExercises coll = new CollectionsExercises();
        System.out.println(coll.useArrayDeque());

    }
}
