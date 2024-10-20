package ru.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.example.models.Circle;
import ru.example.models.Color;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CircleInfoDto {
    private Color color;
    private Double radius;
    private Double area;
    private Double perimeter;
    public CircleInfoDto(Circle circle){
        this.radius = circle.getRadius();
        this.color = circle.getColor();
        this.area = circle.getArea();
        this.perimeter = circle.getPerimeter();
    }
}
