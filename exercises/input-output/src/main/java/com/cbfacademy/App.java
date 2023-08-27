package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String filepath = "exercises/input-output/src/main/resources/exercise.txt";
        String copypath = "exercises/input-output/src/main/resources/new.txt";
        String invertedpath = "exercises/input-output/src/main/resources/inverted.txt";

        readFiles(filepath);
        writeToFile(copypath, filepath);
        inverted(filepath,invertedpath);
        
    }
    //read files
    public static void readFiles(String path){
        try(Stream<String> stream = Files.lines(Paths.get(path))){
            stream.forEach(System.out::println);
        }
        catch(IOException e){
            System.out.println("File excepton:"+e.getMessage());
        }

    } 

    //write to another file
    public static void writeToFile(String toFile, String fromFile){
        try{
            Stream<String> stream = Files.lines(Paths.get(fromFile));
            Path copy = Paths.get(toFile);
            Files.createFile(copy);
            Files.write(copy, (Iterable<String>) stream::iterator);

        }
        catch(IOException e){
          System.out.println("File excepton:"+e.getMessage());  
        }

    }
    //invert file
    public static void inverted(String fromFile, String invertedFile){
        try{
            
            List<String> paath = Files.readAllLines(Paths.get(fromFile));
            Collections.reverse(paath);
            
            Path inverted = Paths.get(invertedFile);
            Files.createFile(inverted);
            Files.write(inverted,paath);

        }

        catch(IOException e){
            System.out.println("File reading exception:"+e.getMessage());
        }

    }
}
