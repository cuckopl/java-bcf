package pawelcudzilo.pl.rest.domain.service;

import org.springframework.stereotype.Service;
import pawelcudzilo.pl.rest.domain.dto.ProductDtoInterface;
import pawelcudzilo.pl.rest.domain.entity.Product;
import pawelcudzilo.pl.rest.domain.exceptions.ProductResourceNotFoundException;
import pawelcudzilo.pl.rest.domain.mapper.ProductMapper;
import pawelcudzilo.pl.rest.domain.repository.ProductRepositoryInterface;

import java.util.Optional;

@Service
public class ProductService implements ProductServiceInterface {

    private final ProductRepositoryInterface repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepositoryInterface repository,
                          ProductMapper mapper
    ) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProductDtoInterface store(ProductDtoInterface dto) {
        Product result = repository.save(mapper.dtoToModel(dto));
        return mapper.modelToDto(result);
    }

    @Override
    public ProductDtoInterface remove(ProductDtoInterface dto) {
        return null;
    }

    @Override
    public ProductDtoInterface save(ProductDtoInterface dto) {
        Product result = repository.save(mapper.dtoToModel(dto));
        return mapper.modelToDto(result);
    }

    @Override
    public ProductDtoInterface update(ProductDtoInterface dto) {
        return null;
    }

    @Override
    public ProductDtoInterface getProduct(Integer id) throws ProductResourceNotFoundException {
        Optional<Product> result = repository.findById(id);

        return mapper.modelToDto(result.orElseThrow(ProductResourceNotFoundException::new));//unreadable code
    }
}
