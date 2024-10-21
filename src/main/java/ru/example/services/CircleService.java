package ru.example.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.repos.CircleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CircleService {
    private final CircleRepository circleRepository;
    public void save(Circle circle){
        circleRepository.save(circle);
    }
    public List<Circle> getAllSorted(){
        return circleRepository.findAllByOrderByRadiusAsc();
    }
    public List<Circle> getByColorSorted(Color color){
        return circleRepository.findByColorOrderByRadiusAsc(color);
    }
}
