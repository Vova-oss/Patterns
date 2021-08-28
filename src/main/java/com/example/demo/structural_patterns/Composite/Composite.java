package com.example.demo.structural_patterns.Composite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Composite implements Shape {

    private List<Shape> shapes = new LinkedList<>();

    public void addShape(Shape... manyShape){
        shapes.addAll(Arrays.asList(manyShape));
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape:shapes)
            shape.draw();
    }
}
