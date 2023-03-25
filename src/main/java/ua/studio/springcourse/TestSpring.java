package ua.studio.springcourse; // визначає пакет, до якого належить клас.

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
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
           Computer computer = context.getBean("computer", Computer.class);
           System.out.println();

           // Випадковий вибір жанру музики
           MusicGenre randomGenre = MusicGenre.values()[new Random().nextInt(MusicGenre.values().length)];
           System.out.println("Selected genre: " + randomGenre);

// Виклик методу відтворення музики з випадково вибраним жанром
           System.out.println(computer.playMusic(randomGenre));

        context.close();
        // - закриває контекст Spring.
    }
}
