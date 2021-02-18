package pawelcudzilo.pl.rest.application.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pawelcudzilo.pl.rest.RestApplication;
import pawelcudzilo.pl.rest.application.dto.Money;
import pawelcudzilo.pl.rest.application.dto.Product;
import pawelcudzilo.pl.rest.domain.dto.ProductDtoInterface;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Objects;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RestApplication.class})
public class ProductControllerTest {

    @Autowired
    ProductController controller;

    @Test
    public void checkValidDataControllerWillReturnSameValues() {

        //given
        Product productDto = createProductObject();

        //when
        ResponseEntity<ProductDtoInterface> responseEntity = controller.postAction(productDto);
        //than
        Assert.notNull(responseEntity);
        Assert.isTrue(Objects.requireNonNull(responseEntity.getBody()).getName().equals(productDto.getName()));
    }


    @Test
    public void checkLocationOfCreatedResource() {
        //given
        Product productDto = createProductObject();
        //when
        ResponseEntity<ProductDtoInterface> responseEntity = controller.postAction(productDto);
        //than

        assertNotNull(responseEntity.getHeaders().getLocation());
        assertEquals("They aren't same",
                "localhost:8080/product/1",
                responseEntity.getHeaders().getLocation().toString());

    }


    private Product createProductObject() {
        Product productDto = new Product();
        Money money = new Money();

        money.setAmount(new BigDecimal("12.44"));
        money.setCurrency("USD");

        productDto.setName("GTX 1080");
        productDto.setPrice(money);
        return productDto;
    }
}