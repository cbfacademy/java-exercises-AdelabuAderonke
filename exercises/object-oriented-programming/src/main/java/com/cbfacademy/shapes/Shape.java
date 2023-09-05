package com.cbfacademy.shapes;

public abstract class Shape {
    String shapeName;
    public abstract double area();

    public String toString(){
        return shapeName;
    }
}
