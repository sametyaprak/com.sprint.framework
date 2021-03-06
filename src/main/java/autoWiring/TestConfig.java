package autoWiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection db4 = applicationContext.getBean(DBConnection.class);
        db4.openConnection();
        db4.closeConnection();
        applicationContext.close();
    }
}
