package pawelcudzilo.pl.rest.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pawelcudzilo.pl.rest.domain.entity.Product;

@Repository
public interface ProductRepositoryInterface extends CrudRepository<Product, Integer> {

}
