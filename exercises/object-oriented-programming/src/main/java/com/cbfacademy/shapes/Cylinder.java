package com.cbfacademy.shapes;

public class Cylinder extends Shape{
    double areaOfCylinder;
    double radius;
    double height;
   public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
   }
    @Override
    public  double area(){
        areaOfCylinder = this.height * Math.PI*Math.pow(this.radius, 2);
        return areaOfCylinder;
    }

    public String toString(){
        return shapeName = "Cylinder";
    }
}
