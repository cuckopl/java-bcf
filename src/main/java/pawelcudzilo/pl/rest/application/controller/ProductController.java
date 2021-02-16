package pawelcudzilo.pl.rest.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pawelcudzilo.pl.rest.application.dto.Product;


@RestController
public class ProductController {

    @GetMapping("/product/{id}")
    public String getAction(String name, @PathVariable Integer id) {
        return String.format("Hello %d!", id);
    }

    @PostMapping("/product")
    public ResponseEntity<?> postAction(@Validated @RequestBody Product product) {

        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }


}
