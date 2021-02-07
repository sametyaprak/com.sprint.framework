package inheritanceMerge;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("inheritanceMerge.xml");
        Database database = (Database) applicationContext.getBean("oracleDatabase");
        System.out.println(database.toString());


        System.out.println(" \t----------------------------");

        ConfigurableApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("inheritanceMerge.xml");
        Database database2 = (Database) applicationContext2.getBean("mysqlDatabase");
        System.out.println(database2.toString());



    }
}
