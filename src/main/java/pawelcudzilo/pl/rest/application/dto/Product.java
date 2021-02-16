package pawelcudzilo.pl.rest.application.dto;

import lombok.Getter;
import lombok.Setter;
import pawelcudzilo.pl.rest.domain.dto.ProductDtoInterface;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Getter
@Setter
final public class Product implements ProductDtoInterface {

    @NotBlank(message = "Name can't be blank")
    @Size(min = 3)
    private String name;

    @Valid
    private Money price;


}
