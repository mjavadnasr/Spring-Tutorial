package BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage1();
        obj.getMessage2();

        HelloIran helloIran = (HelloIran) context.getBean("helloIran");
        helloIran.getMessage1();
        helloIran.getMessage2();
        helloIran.getMessage3();
    }


}
