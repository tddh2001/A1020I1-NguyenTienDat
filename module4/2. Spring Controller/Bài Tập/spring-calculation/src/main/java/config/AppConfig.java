package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.CalculationService;
import service.CalculationServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    public CalculationService calculationService(){
        return new CalculationServiceImpl();
    }
}
