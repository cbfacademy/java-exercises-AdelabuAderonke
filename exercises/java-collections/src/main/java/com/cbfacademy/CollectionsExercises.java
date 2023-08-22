package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(8);
        myList.add(2);
        myList.add(9);
        myList.addLast(2);
        myList.add(2, 4);

        // - add 4 as the first element of the list
        // - then add 5, 6, 8, 2, 9 to the the list
        // - add another 2 as the last element of the list
        // - add 4 as the 3rd element of the list
        // - invoke the method element() on the list and print the result on the screen
        // - return the list
        return myList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        // - add 5, 6, 8, 9 to the the stack
        // - print the first element of the stack on the screen
        // - print the last element of the stack on the screen
        // - invoke the method pop() on the stack and print the result on the screen
        // - invoke the push(4) method on the stack
        // - return the stack
        throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        // - add 5, 6, 8, 9 to the the stack
        // - print the first element of the queue on the screen
        // - print the last element of the queue on the screen
        // - invoke the method poll() on the queue and print the result on the screen
        // - invoke the element() method on the queue and print the result on the screen
        // - return the queue
        //Integer[] numbers = {5, 6, 8, 9 };
        //List<Integer> integers = new ArrayList<>(Arrays.AsList(numbers));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);        
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
        System.out.println(arrayDeque.getFirst());

        throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        // - add {1, TypeScript} entry to the map
        // - add {2, Kotlin} entry to the map
        // - add {3, Python} entry to the map
        // - add {4, Java} entry to the map
        // - add {5, JavaScript} entry to the map
        // - add {6, Rust} entry to the map
        // - determine the set of keys from the map and print it on the screen
        // - determine the set of keys from the map and print it on the screen
        // - determine whether the map contains "English" as a language and print the
        // result on the screen
        // - return the map
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
