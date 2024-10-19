package ru.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

public class Circle extends Shape{
    private Double r;

    public Circle(Double r, Color color) {
        super(color);
        this.r = r;
    }

    @Override
    public Double getArea() {
        return Math.PI*this.r*this.r;
    }

    @Override
    public Double getPerimeter() {
        return 2*Math.PI*this.r;
    }
}
