package com.cbfacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //tring out both filewriter and printwriter
        //PrintWriter for copyexercise.txt
        //FileWriter for copyexercise2.txt
        String filepath = "exercises/input-output/src/main/resources/exercise.txt";
        String copypath = "exercises/input-output/src/main/resources/copyexercise.txt";
        String copypath2 = "exercises/input-output/src/main/resources/copyexercise2.txt";
        try(
            FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);
            PrintWriter printWriter = new PrintWriter(copypath);
            FileWriter fileWriter = new FileWriter(copypath2))
            
            {
             String outputLine = bufferedReader.readLine();
             while(outputLine != null){
                printWriter.println(outputLine);
                fileWriter.write(outputLine + System.lineSeparator());
                

                outputLine = bufferedReader.readLine();

               
             } 

            }catch(IOException e){
                System.out.println("File reading exception:"+ e.getMessage());
            }

    }
}
    

