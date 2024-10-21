package ru.example.dto;

import lombok.*;
import ru.example.models.Circle;

@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CircleDto extends ShapeDto{
    private Double radius;
    public CircleDto(Circle circle){
        super(circle);
        this.radius = circle.getRadius();
    }
}
