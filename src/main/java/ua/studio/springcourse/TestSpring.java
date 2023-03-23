package ua.studio.springcourse; // визначає пакет, до якого належить клас.

import org.springframework.context.support.ClassPathXmlApplicationContext;
// - імпортує клас ClassPathXmlApplicationContext з пакету Spring Framework.
/**
 * @author Andre Murano
 */
public class TestSpring {
       public static void main(String[] args) {
        //- визначає точку входу в додаток.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

           Music music = context.getBean("rockMusic", Music.class);
           MusicPlayer musicPlayer = new MusicPlayer(music);
           musicPlayer.playMusic();

           Music music1 = context.getBean("classicalMusic", Music.class);
           MusicPlayer musicPlayer1 = new MusicPlayer(music1);
           musicPlayer1.playMusic();

           Music music2 = context.getBean("popMusic", Music.class);
           MusicPlayer musicPlayer2 = new MusicPlayer(music2);
           musicPlayer2.playMusic();

        context.close();
        // - закриває контекст Spring.
    }
}
