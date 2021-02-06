package autoWiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("autoWiring.xml");

        DBConnection dbConnection = (DBConnection) applicationContext.getBean("ali");
        dbConnection.openConnection();
        dbConnection.closeConnection();
        applicationContext.close();

    }
}
