package pawelcudzilo.pl.rest.application.error;

import java.util.Date;

public class ProductDetails {
    private final Date timestamp;
    private final String message;
    private final String details;

    public ProductDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}