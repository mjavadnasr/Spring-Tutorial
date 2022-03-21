package AutowiredDef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        vehicle vehicle = (BeanPropertyXML.vehicle) context.getBean("vehicle");
//        vehicle.ride();
//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);
        Car car = (Car) context.getBean("car");
        car.ride();

    }
}
