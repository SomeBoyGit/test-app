package ru.someboy.testapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        List<String> song = Arrays.asList("Hungarian Rhapsody", "The Tale of Tsar Saltan", "The Seasons");
        return song.get(getRandomNumberUsingInts(0, song.size()));
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing My Initialization!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing My Destruction!");
    }
    public int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
