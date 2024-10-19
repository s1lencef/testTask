package ru.example.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Shape{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double length;
    private Double width;
    @Enumerated(value = EnumType.ORDINAL)
    private Color color;


    @Override
    public Double getArea() {
        return length*width;
    }

    @Override
    public Double getPerimeter() {
        return (length+width)*2;
    }
    public Double getDiagonal(){
        return Math.sqrt(length*length+width*width);
    }
}
