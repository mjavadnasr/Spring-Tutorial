package AutowiredDef;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    public String brand;

    @Override
    public String toString() {
        return "brandName";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
