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
           Computer computer = context.getBean("computer", Computer.class);
           System.out.println(computer);
        context.close();
        // - закриває контекст Spring.
    }
}
