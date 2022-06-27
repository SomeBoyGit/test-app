package ru.someboy.testapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }


//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(rockMusic(), classicalMusic());
//    }

    @Bean
    public MusicPlayer musicPlayer() {
        ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(classicalMusic());
        musicList.add(rapMusic());
        return new MusicPlayer(musicList);
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
