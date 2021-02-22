package pawelcudzilo.pl.rest.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import pawelcudzilo.pl.rest.application.url.provider.OrderUrlProvider;

@Configuration
@ComponentScan(basePackages = "pawelcudzilo")
@Import(pawelcudzilo.pl.domain.Configuration.class) //IMPORT MODULES !!
@EnableConfigurationProperties
@Profile("production")
public class ConfigProd {

    @Bean
    public OrderUrlProvider orderUrlProvider() {
        return new OrderUrlProvider("prod-uri");
    }

}
