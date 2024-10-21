package ru.example.dto;

import lombok.*;
import ru.example.models.Rectangle;

@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RectangleDto extends ShapeDto{
    private Double width;
    private Double length;
    private Double diagonal;
    public  RectangleDto(Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.getWidth();
        this.length = rectangle.getLength();
        this.diagonal = rectangle.getDiagonal();
    }
}
