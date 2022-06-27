package ru.someboy.testapp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        List<String> song = Arrays.asList("Wind cries Mary", "Smells Like Teen Spirit", "Smoke On The Water");
        return song.get(getRandomNumberUsingInts(0, song.size()));
    }

    public int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
