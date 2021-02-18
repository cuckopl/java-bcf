package pawelcudzilo.pl.rest.application.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class Money {


    @Getter
    @Setter
    @NotBlank(message = "Please enter correct currency")
    public String currency;

    @Getter
    @Setter
    @Positive
    @DecimalMin("5")
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    @NotNull(message = "Please enter valid amount")
    public BigDecimal amount;
}
