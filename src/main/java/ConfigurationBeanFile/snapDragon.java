package ConfigurationBeanFile;

import org.springframework.stereotype.Component;

@Component
public class snapDragon implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("Cpu is SnapDragon");

    }
}
