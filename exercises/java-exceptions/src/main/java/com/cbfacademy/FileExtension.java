package com.cbfacademy;

public class FileExtension {
    public static int check(String filename)throws NullorEmptyException {
        if(filename == null || filename ==""){
            throw new NullorEmptyException("file name cannot be null or empty");
        }
        else if(filename.endsWith(".java")){
            return 1;
        }
        else{
            return 0;
        }
    }
}
