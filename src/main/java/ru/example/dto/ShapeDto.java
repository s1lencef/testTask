package ru.example.dto;

import lombok.*;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.models.Rectangle;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ShapeDto {
    private Long id;
    private Type type;
    private Color color;
    private Double area;
    private Double perimeter;

    public ShapeDto(Circle circle){
        this.id = circle.getId();
        this.type = Type.CIRCLE;
        this.color = circle.getColor();
        this.area = circle.getArea();
        this.perimeter = circle.getPerimeter();
    }
    public ShapeDto(Rectangle rectangle){
        this.id = rectangle.getId();
        this.type = Type.RECTANGLE;
        this.color = rectangle.getColor();
        this.area = rectangle.getArea();
        this.perimeter = rectangle.getPerimeter();
    }
}
