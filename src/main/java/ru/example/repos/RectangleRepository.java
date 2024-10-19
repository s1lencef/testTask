package ru.example.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.models.Rectangle;

public interface RectangleRepository extends JpaRepository<Rectangle, Long> {
}
