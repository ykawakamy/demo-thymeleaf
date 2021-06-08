package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.service.AnimalService;
import demo.service.AnimalServiceStub;

@Configuration
public class AppConfig {
    @Bean
    AnimalService animalService() {
        return new AnimalServiceStub();
    }
}
