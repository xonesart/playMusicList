package ua.studio.springcourse; // визначає пакет, до якого належить клас.

import org.springframework.context.support.ClassPathXmlApplicationContext;
// - імпортує клас ClassPathXmlApplicationContext з пакету Spring Framework.

/**
 * @author Andre Murano
 */
public class TestSpring {
    // - визначає клас з назвою TestSpring.

    public static void main(String[] args) {
        //- визначає точку входу в додаток.

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();
        MusicPlayer secondMusicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
        secondMusicPlayer.playMusic();

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(20);
        System.out.println(firstMusicPlayer.getVolume()+ "% volume in first music player");
        System.out.println(secondMusicPlayer.getVolume()+ "% volume in second music player");
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
        // - закриває контекст Spring.
    }
}
