package config;

import model.Service.CustomerService;
import model.Service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CustomerService customerService(){
        return new CustomerServiceImpl();
    }
}
