package ru.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.dto.CircleInfoDto;
import ru.example.models.Circle;
import ru.example.models.Color;

@RestController
@RequiredArgsConstructor
public class ShapeController {
    @GetMapping("/circles")
    public ResponseEntity<CircleInfoDto> circles(){
        Circle c = new Circle(3.0,Color.red);
        return ResponseEntity.ok(new CircleInfoDto(c));
    }
}
