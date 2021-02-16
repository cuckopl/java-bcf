package pawelcudzilo.pl.rest.application.request.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pawelcudzilo.pl.rest.application.dto.Product;

public class ProductValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Product.class.equals(aClass);
    }

    @Override
    public void validate(Object dto, Errors errors) {
        Product productDto = (Product) dto;
    }
}
