package com.example.shapes.twodshapes.shapes;

import com.example.shapes.twodshapes.TwoDimensionedShape;

public class Square extends TwoDimensionedShape {
    public Square(float area) {
        super(area);
        this.isConvex = true;
    }
}
