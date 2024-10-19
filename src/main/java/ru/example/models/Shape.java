package ru.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public interface Shape {
    public abstract Double getArea();
    public abstract Double getPerimeter();

}
