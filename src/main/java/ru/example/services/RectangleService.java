package ru.example.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.models.Rectangle;
import ru.example.repos.RectangleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RectangleService {
    private final RectangleRepository rectangleRepository;
    public List<Rectangle> getAll(){
        return rectangleRepository.findAll();
    }
}
