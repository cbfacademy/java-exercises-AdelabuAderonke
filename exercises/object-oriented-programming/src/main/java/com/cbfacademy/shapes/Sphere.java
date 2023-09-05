package com.cbfacademy.shapes;

public class Sphere extends Shape {
    double areaOfSphere;
    double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public  double area(){
        areaOfSphere = 4 * Math.PI*Math.pow(this.radius, 2);
        return areaOfSphere;
    }

    public String toString(){
        return shapeName = "Sphere";
    }
}
