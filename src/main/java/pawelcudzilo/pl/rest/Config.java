package pawelcudzilo.pl.rest;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "pawelcudzilo")
@Import(pawelcudzilo.pl.domain.Configuration.class) //IMPORT MODULES !!
public class Config {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
