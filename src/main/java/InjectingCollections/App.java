package InjectingCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        JavaCollection collection  = (JavaCollection) context.getBean("javaCollection");
        collection.getAddressList();
        collection.getAddressSet();
        collection.getAddressMap();
        collection.getAddressProp();
    }
}
