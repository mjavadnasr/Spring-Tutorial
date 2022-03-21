package AutowiredDef;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle {
    @Override
    public void ride() {
        System.out.println("bike is riding");

    }
}
