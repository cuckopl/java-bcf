package pawelcudzilo.pl.rest.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
@Setter
@Getter
public class Money {

    public BigDecimal amount;

    public String currency;

}
