package pawelcudzilo.pl.rest.domain.service;

import pawelcudzilo.pl.rest.domain.dto.ProductDtoInterface;
import pawelcudzilo.pl.rest.domain.exceptions.ProductResourceNotFoundException;

public interface ProductServiceInterface {

    ProductDtoInterface store(ProductDtoInterface dto);

    ProductDtoInterface remove(ProductDtoInterface dto);

    ProductDtoInterface save(ProductDtoInterface dto);

    ProductDtoInterface update(ProductDtoInterface dto);

    ProductDtoInterface getProduct(Integer id) throws ProductResourceNotFoundException;
}
