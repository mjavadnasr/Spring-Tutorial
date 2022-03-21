package ConfigurationBeanFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Samsung getSamsung()
    {
        return new Samsung();
    }

    @Bean
    public MobileProcessor getCpu()
    {
        return new snapDragon();
    }

}
