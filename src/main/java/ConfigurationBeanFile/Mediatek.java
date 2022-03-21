package ConfigurationBeanFile;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mediatek implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("cpu is Mediatek");
    }
}
