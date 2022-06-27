package ru.someboy.testapp;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    private final Music music1;
//    private final Music music2;

    private final ArrayList<Music> musicList;
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public MusicPlayer(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }
//    public String playMusic(MusicEnum musicEnum) {
//        String result = null;
//        switch (musicEnum) {
//            case ROCK:
//                result = "Playing: " + music1.getSong();
//                break;
//            case CLASSICAL:
//                result = "Playing: " + music2.getSong();
//                break;
//        }
//        return result;
//    }
    public String playMusic() {
        int random = new Random().nextInt(3);
        return musicList.get(random).getSong();
    }

}
