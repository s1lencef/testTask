package ru.example.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.dto.CircleDto;
import ru.example.dto.RectangleDto;
import ru.example.dto.ShapeDto;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.models.Rectangle;
import ru.example.models.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShapesService {
    private final CircleService circleService;
    private final RectangleService rectangleService;

    public ArrayList<CircleDto> getCircles(){
        ArrayList<CircleDto> circles = new ArrayList<>();
        circleService.getAllSorted().forEach(circle -> circles.add(new CircleDto(circle)));
        return circles;
    }

    public List<RectangleDto> getRectangles(){
        ArrayList<RectangleDto> rectangles = new ArrayList<>();
        rectangleService.getSortedByDiagonal().forEach(rectangle -> rectangles.add(new RectangleDto(rectangle)));
        return rectangles;
    }
    public List<ShapeDto> getShapes(Color c){
        if (c != null) {
            return mergeLists(circleService.getByColorSorted(c),rectangleService.getByColorSorted(c));
        }
        return mergeLists(circleService.getAllSorted(),rectangleService.getSortedByArea());

    }
    private List<ShapeDto> mergeLists(List<Circle>circles, List<Rectangle> rectangles){
        ArrayList<ShapeDto> shapes = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = circles.size();
        int m = rectangles.size();
        while (i<n && j<m){
            if(circles.get(i).getArea()<rectangles.get(j).getArea()){
                shapes.add(new CircleDto(circles.get(i)));
                i++;
            }else{
                shapes.add(new RectangleDto(rectangles.get(j)));
                j++;
            }
        }
        while(i<n){
            shapes.add(new CircleDto(circles.get(i)));
            i++;
        }
        while(j<m){
            shapes.add(new RectangleDto(rectangles.get(j)));
            j++;
        }
        return shapes;
    }

}
