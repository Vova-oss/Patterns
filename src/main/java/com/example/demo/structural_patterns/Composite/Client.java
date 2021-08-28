package com.example.demo.structural_patterns.Composite;

public class Client {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape square1 = new Square();
        Shape square2 = new Square();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite1.addShape(composite2, square1, triangle1, circle1);
        composite2.addShape(circle2, triangle2, square2);

        composite1.draw();
    }
}
