package ru.example.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.models.Color;
import ru.example.models.Rectangle;
import ru.example.repos.RectangleRepository;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RectangleService{
    private final RectangleRepository rectangleRepository;
    public List<Rectangle> getAll(){
        return rectangleRepository.findAll();
    }
    public void save(Rectangle rectangle){
        rectangleRepository.save(rectangle);
    }
    public List<Rectangle> getSortedByDiagonal(){
        List<Rectangle> rectangles  = rectangleRepository.findAll();
        rectangles.sort(Comparator.comparing(Rectangle::getDiagonal));
        return rectangles;
    }
    public List<Rectangle> getSortedByArea(){
        List<Rectangle> rectangles  = rectangleRepository.findAll();
        rectangles.sort(Comparator.comparing(Rectangle::getArea));
        return rectangles;
    }
    public List<Rectangle> getByColorSorted(Color color){
        List<Rectangle> rectangles  = rectangleRepository.findByColor(color);
        rectangles.sort(Comparator.comparing(Rectangle::getArea));
        return rectangles;
    }
}
