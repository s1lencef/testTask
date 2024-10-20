package ru.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.models.Circle;
import ru.example.models.Color;

import java.util.List;

public interface CircleRepository extends JpaRepository<Circle, Long> {
    List<Circle> findAllByOrderByRadiusAsc();
    List<Circle> findByColorOrderByRadiusAsc(Color color);;
}
