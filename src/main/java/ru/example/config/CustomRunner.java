package ru.example.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.example.models.Circle;
import ru.example.models.Color;
import ru.example.models.Rectangle;
import ru.example.services.CircleService;
import ru.example.services.RectangleService;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class CustomRunner implements ApplicationRunner {
    private final CircleService circleService;
    private final RectangleService rectangleService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        for(int i = 0; i<3;i ++){
            circleService.save(new Circle(getRandomNumber(),Color.getRandomColor()));
        }
        for(int i = 0; i<4;i++){
            rectangleService.save(new Rectangle(getRandomNumber(),getRandomNumber(),Color.getRandomColor()));
        }
    }

    private Double getRandomNumber(){
        Random random = new Random();
        double r = random.nextDouble();
        if(r>0.0){
            return r*10;
        }
        return (r+0.1)*10;
    }
}
