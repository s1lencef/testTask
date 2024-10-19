package ru.example.models;

public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public Double getArea() {
        return 0.0;
    }

    @Override
    public Double getPerimeter() {
        return 0.0;
    }
}
