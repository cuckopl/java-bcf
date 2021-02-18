package pawelcudzilo.pl.rest.domain.dto;


import pawelcudzilo.pl.rest.application.dto.Money;

public interface ProductDtoInterface {

     Integer getId();

     String getName();

     void setName(String name);

     Money getPrice();

     void setPrice(Money price);


}
