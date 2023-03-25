package ua.studio.springcourse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {



    private List<String> classicalSongs = new ArrayList<>();
    private List<String> rockSongs = new ArrayList<>();
    private List<String> popSongs = new ArrayList<>();

    public MusicPlayer() {
        // Додавання пісень до списків відповідних жанрів музики
        classicalSongs.add("Moonlight Sonata");
        classicalSongs.add("The Four Seasons");
        classicalSongs.add("Canon in D");

        rockSongs.add("Stairway to Heaven");
        rockSongs.add("Bohemian Rhapsody");
        rockSongs.add("Sweet Child O' Mine");

        popSongs.add("Shape of You");
        popSongs.add("Uptown Funk");
        popSongs.add("Havana");
    }

    public String playMusic(MusicGenre genre) {
        Random rand = new Random();
        switch (genre) {
            case CLASSICAL:
                return "Playing: " + classicalSongs.get(rand.nextInt(classicalSongs.size()));
            case ROCK:
                return "Playing: " + rockSongs.get(rand.nextInt(rockSongs.size()));
            case POP:
                return "Playing: " + popSongs.get(rand.nextInt(popSongs.size()));
            default:
                return "Invalid music genre";
        }
    }

}
enum MusicGenre {
    CLASSICAL,
    ROCK,
    POP
}

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MusicPlayer {
//       private Music music1;
//    private Music music2;
//    private Music music3;
//
//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
//                       @Qualifier("rockMusic") Music music2,
//                       @Qualifier("popMusic") Music music3) {
//        this.music1 = music1;
//        this.music2 = music2;
//        this.music3 = music3;
//    }
//
//       public String playMusic() {
//        return "Playing: " + music1.getSong() + ", " + music2.getSong() + ", " + music3.getSong();
//    }
//
//}
