package com.example.shapes;

import com.example.shapes.threedshapes.shapes.Cube;
import com.example.shapes.threedshapes.shapes.Sphere;
import com.example.shapes.twodshapes.shapes.Circle;
import com.example.shapes.twodshapes.shapes.Square;

public class ShapeFactory {

    public static void main(String[] args) {

        Shape circle = new Circle(28.27f);
        System.out.println("Circle's area is: " + circle.getArea());
        Shape square = new Square(16);
        System.out.println("Square's area is: " +square.getArea());
        Shape cube = new Cube(24);
        System.out.println("Cube's area is: " + cube.getArea());
        Shape sphere = new Sphere(52.31f);
        System.out.println("Sphere's area is: " + sphere.getArea());
        
    }
}
