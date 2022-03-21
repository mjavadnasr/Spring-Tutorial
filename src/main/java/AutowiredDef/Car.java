package AutowiredDef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {
    @Autowired
    public Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public void ride() {
        System.out.println("car is drivin with " + tyre);

    }
}
