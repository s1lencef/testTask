package ru.example.models;

import net.bytebuddy.utility.RandomString;

import java.sql.SQLOutput;
import java.util.Random;

public enum Color {
    red,blue,green,yellow,white,black;
    public static Color getRandomColor(Random random){
        int colorOrd = random.nextInt(5);
        for (Color color: Color.values()){
            if(color.ordinal() == colorOrd){
                return color;
            }
        }
        return null;
    }
    public static void  printOrdinal(){
        for(Color color: Color.values()){
            System.out.println(color.ordinal());
        }

    }
}
