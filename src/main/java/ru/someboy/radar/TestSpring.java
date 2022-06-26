package ru.someboy.radar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic firstClassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic secondClassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic thirdClassicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(firstClassicalMusic.getSong());
        System.out.println(secondClassicalMusic.getSong());
        System.out.println(thirdClassicalMusic.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        firstMusicPlayer.setVolume("10");
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        musicPlayer.playMusicList();
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
