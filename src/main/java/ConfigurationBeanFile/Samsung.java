package ConfigurationBeanFile;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    MobileProcessor cpu ;
    public void config()
    {
        System.out.println("samsung s22 ultra");
        cpu.process();
    }
}
