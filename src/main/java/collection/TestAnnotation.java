package collection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DBConnection db4 = applicationContext.getBean(DBConnection.class);
        db4.openConnection();
        applicationContext.close();

    }

}
