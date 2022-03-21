package BeanPropertyXML;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {
    @Override
    public void ride() {
        System.out.println("car is driving");

    }
}
