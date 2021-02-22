package pawelcudzilo.pl.rest.application.url.provider;

import org.springframework.beans.factory.annotation.Value;

import java.net.URI;
import java.net.URISyntaxException;

public class OrderUrlProvider {

    private final static String PRODUCT_URL_PATTERN = "%s/product/%d";

    @Value("${main.url.provider.product}")
    private final String uri;

    public OrderUrlProvider(String uri) {
        this.uri = uri;
    }


    public URI resourceUrl(Long id) throws URISyntaxException {
        return new URI(String.format(OrderUrlProvider.PRODUCT_URL_PATTERN, this.uri, id));
    }


}
