package pawelcudzilo.pl.rest;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pawelcudzilo")
public class Config {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
