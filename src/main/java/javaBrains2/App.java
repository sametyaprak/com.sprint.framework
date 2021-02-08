package javaBrains2;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("javaBrains2.xml");
        Draw draw = (Draw) applicationContext2.getBean("fourAngle");
        draw.draw();
    }
}
