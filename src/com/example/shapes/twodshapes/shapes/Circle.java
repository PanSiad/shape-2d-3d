package com.example.shapes.twodshapes.shapes;

import com.example.shapes.Shape;
import com.example.shapes.twodshapes.TwoDimensionedShape;

public class Circle extends TwoDimensionedShape {

    public Circle(float area) {
        super(area);
        this.isConvex = true;
    }


}
