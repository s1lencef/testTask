package ru.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.example.dto.CircleInfoDto;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.models.Rectangle;
import ru.example.models.Shape;
import ru.example.services.CircleService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShapeController {
    private final CircleService circleService;
    @GetMapping("/circles")
    public ResponseEntity<List<Circle>> circles(){
        return ResponseEntity.ok(circleService.getAll());
    }
    @GetMapping("/rectangles")
    public ResponseEntity<List<Rectangle>> rectangles(){
        return ResponseEntity.ok(circleService.getAll());
    }
    @GetMapping("/figures")
    public ResponseEntity<List<Shape>> figures(@RequestParam Color c){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.addAll(circleService.getAll());
        return ResponseEntity.ok(shapes);
    }
}
}
