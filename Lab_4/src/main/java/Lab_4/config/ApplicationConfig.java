package Lab_4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring-jpa.xml")
@ComponentScan("Lab_4")
public class ApplicationConfig {

}
