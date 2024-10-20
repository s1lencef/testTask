package ru.example.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.models.Rectangle;
import ru.example.models.Shape;
import ru.example.services.CircleService;
import ru.example.services.RectangleService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShapeController {
    private final CircleService circleService;
    private final RectangleService rectangleService;
    @GetMapping("/circles")
    public ResponseEntity<List<Circle>> circles(){
        return ResponseEntity.ok(circleService.getSortedAll());
    }
    @GetMapping("/rectangles")
    public ResponseEntity<List<Rectangle>> rectangles(){
        return ResponseEntity.ok(rectangleService.getAll());
    }
    @GetMapping("/figures")
    public ResponseEntity<List<Shape>> figures(@RequestParam(required = false) Color c){
        ArrayList<Shape> shapes = new ArrayList<>();
        if (c != null) {
            shapes.addAll(circleService.getSortedByColor(c));
        }

//        shapes.addAll(rectangleService.getAll());
        return ResponseEntity.ok(shapes);
    }
}

