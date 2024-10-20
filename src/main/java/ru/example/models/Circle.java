package ru.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Circle implements Shape{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double radius;
    @Enumerated(value = EnumType.ORDINAL)
    private Color color;

    public Circle(Double r, Color color) {
        this.color = color;
        this.radius = r;
    }

    @Override
    public Double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public Double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
