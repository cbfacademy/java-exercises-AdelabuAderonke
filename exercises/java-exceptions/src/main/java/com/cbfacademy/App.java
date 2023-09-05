package com.cbfacademy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> nameofFiles = Arrays.asList("App.java", "App.txt", null, "App.md");
        Map<String, Integer> output = new HashMap<>();

        for (String f : nameofFiles) {
            try {
                output.put(f, FileExtension.check(f));

            } catch (NullorEmptyException e) {
                output.put(f, -1);
            }

        }

        System.out.println(output);
    }
}
