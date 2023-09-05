package com.cbfacademy.shapes;

public class Rectangle extends Shape{
    double areaOfRectangle;
    double width;
    double length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public  double area(){
        areaOfRectangle = this.length * this.width;
        return areaOfRectangle;
    }

    public String toString(){
        return shapeName = "Rectangle";
    }
}
