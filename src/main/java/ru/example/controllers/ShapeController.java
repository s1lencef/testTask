package ru.example.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.example.dto.CircleDto;
import ru.example.dto.RectangleDto;
import ru.example.dto.ShapeDto;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.models.Rectangle;
import ru.example.models.Shape;
import ru.example.services.CircleService;
import ru.example.services.RectangleService;
import ru.example.services.ShapesService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShapeController {
    private final ShapesService shapesService;
    @GetMapping("/circles")
    public ResponseEntity<ArrayList<CircleDto>> circles(){
        return ResponseEntity.ok(shapesService.getCircles());
    }
    @GetMapping("/rectangles")
    public ResponseEntity<List<RectangleDto>> rectangles(){
        return ResponseEntity.ok(shapesService.getRectangles());
    }
    @GetMapping("/figures")
    public ResponseEntity<List<ShapeDto>> figures(@RequestParam(required = false) Color c){
        return ResponseEntity.ok(shapesService.getShapes(c));
    }
}

