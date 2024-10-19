package ru.example.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract Double getArea();
    public abstract Double getPerimeter();

}
