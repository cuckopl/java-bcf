package pawelcudzilo.pl.rest.application.dto;

import lombok.Getter;
import lombok.Setter;
import pawelcudzilo.pl.domain.comunication.dto.MoneyDtoInterface;
import pawelcudzilo.pl.domain.comunication.dto.ProductDtoInterface;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Getter
@Setter
final public class Product implements ProductDtoInterface {

    private Integer id;

    @NotBlank(message = "Name can't be blank")
    @Size(min = 3)
    private String name;

    @Valid
    private Money price;

    @Override
    public Integer getId() {
        return this.id;
    }

}
