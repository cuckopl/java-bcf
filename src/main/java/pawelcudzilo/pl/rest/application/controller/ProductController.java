package pawelcudzilo.pl.rest.application.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pawelcudzilo.pl.domain.comunication.dto.ProductDtoInterface;
import pawelcudzilo.pl.domain.core.exceptions.ProductResourceNotFoundException;
import pawelcudzilo.pl.domain.comunication.service.ProductServiceInterface;
import pawelcudzilo.pl.rest.application.dto.Product;


@RestController
public class ProductController {

    private final ProductServiceInterface productService;

    public ProductController(ProductServiceInterface productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDtoInterface> getAction(String name, @PathVariable Integer id) throws ProductResourceNotFoundException {
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<ProductDtoInterface> postAction(@Validated @RequestBody Product product) {
        ProductDtoInterface savedProduct = productService.save(product);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", String.format("localhost:8080/product/%d", savedProduct.getId()));

        return new ResponseEntity<>(savedProduct, headers, HttpStatus.CREATED);

    }


}
