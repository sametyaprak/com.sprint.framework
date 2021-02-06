package inheritance;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("inheritance.xml");
        Database database = (Database) applicationContext.getBean("oracleDatabase");
        System.out.println(database.toString());

        System.out.println(" \t----------------------------");

        ConfigurableApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("inheritance.xml");
        Database database2 = (Database) applicationContext.getBean("mysqlDatabase");
        System.out.println(database.toString());



    }
}
