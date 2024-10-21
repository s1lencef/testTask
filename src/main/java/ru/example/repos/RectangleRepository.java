package ru.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.models.Color;
import ru.example.models.Rectangle;

import java.util.List;

public interface RectangleRepository extends JpaRepository<Rectangle, Long> {
    List<Rectangle> findByColor(Color color);
}
