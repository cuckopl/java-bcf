package pawelcudzilo.pl.rest.application.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pawelcudzilo.pl.domain.comunication.order.dto.OrderDtoInterface;
import pawelcudzilo.pl.domain.comunication.order.service.OrderServiceInterface;
import pawelcudzilo.pl.rest.application.dto.Order;
import pawelcudzilo.pl.rest.application.url.provider.OrderUrlProvider;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderServiceInterface orderService;

    private final OrderUrlProvider urlProvider;

    public OrderController(OrderServiceInterface orderService, OrderUrlProvider urlProvider) {

        this.orderService = orderService;
        this.urlProvider = urlProvider;
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDtoInterface> get(@PathVariable Long id) {
        return new ResponseEntity<>(this.orderService.get(id), HttpStatus.OK);
    }


    @PostMapping("/")
    public ResponseEntity<OrderDtoInterface> store(@RequestBody @Validated Order order) throws URISyntaxException {
        OrderDtoInterface storedOrder = this.orderService.store(order);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", urlProvider.resourceUrl(storedOrder.getId()).toString());
        return new ResponseEntity<>(storedOrder, headers, HttpStatus.CREATED);
    }
}
