package ru.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.models.Circle;

public interface CircleRepository extends JpaRepository<Circle, Long> {
}
