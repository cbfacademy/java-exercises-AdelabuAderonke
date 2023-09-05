package com.cbfacademy;

import com.cbfacademy.cars.Car;
import com.cbfacademy.shapes.Shape;
import com.cbfacademy.shapes.Sphere;
import com.cbfacademy.shapes.Rectangle;

//import com.cbfacademy.cars.car;
public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        //Rectangle rect = new Rectangle(10, 5);
        Shape sphere = new Sphere(7);
        System.out.println("The area of the sphere = "+sphere.area()+sphere);

        Shape rect = new Rectangle(5, 2);
        System.out.println("The area of the rectangle = "+rect.area());
        /**
         * Car car1 = new Car("Volvo", "V40", 2012);
         * System.out.println(car1.details());
         * Car car2 = new Car("Porsche", "Panarama", 2009);
         * System.out.println(car2.details());
         * Car car3 = new Car("Audi", "V40", 2018);
         * System.out.println(car3.details());
         */

    }
}
