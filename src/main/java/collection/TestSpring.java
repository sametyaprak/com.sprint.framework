package collection;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("collection.xml");
        DBConnection db4 = (DBConnection) configurableApplicationContext.getBean("project8");
        db4.openConnection();

        configurableApplicationContext.close();
    }


}
