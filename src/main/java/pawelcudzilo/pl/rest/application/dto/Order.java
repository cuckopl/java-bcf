package pawelcudzilo.pl.rest.application.dto;

import lombok.Getter;
import lombok.Setter;
import pawelcudzilo.pl.domain.comunication.order.dto.OrderDtoInterface;

@Setter
@Getter
public class Order implements OrderDtoInterface {

    @Override
    public Long getId() {
        return null;
    }
}
