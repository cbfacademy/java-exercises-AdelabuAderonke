package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main(String...args){

        Paint paint = new Paint(150);
        Rectangle rectangleDeck = new Rectangle(20, 35);
        Sphere sphereBall = new Sphere(15);
        Cylinder cylinderTank = new Cylinder(10, 30);

        double total = (paint.amount(rectangleDeck) + paint.amount(sphereBall)+paint.amount(cylinderTank));
        System.out.println(String.format("The total amount of paint needed per gallons is %.2f", total));
        

    }
}
