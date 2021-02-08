package javaBrains1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class App {

    public static void main(String[] args) {

        //pjoje seviyesinde xml.dosyası olusturmak gerekiyor.
//        BeanFactory factory = new XmlBeanFactory((new FileSystemResource("javaBranis1.xml")));
//        Triangle triangle = (Triangle) factory.getBean("triangle");
//        triangle.draw();
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("javaBrains1.xml");
//        Triangle triangle1 = (Triangle) context.getBean("triangle");
//        triangle1.draw();

        ConfigurableApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("javaBrains1.xml");
        Triangle2 triangle2 = (Triangle2) applicationContext2.getBean("triangle2");
        triangle2.draw();

    }
}
