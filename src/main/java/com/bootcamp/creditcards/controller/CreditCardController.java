package com.bootcamp.creditcards.controller;

import com.bootcamp.creditcards.dto.CreditCardDto;
import com.bootcamp.creditcards.resource.CreditCardResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/creditcard")
public class CreditCardController {

    @Autowired
    private CreditCardResource creditCardResource;

    @PostMapping
    public Mono<CreditCardDto> create(@RequestBody CreditCardDto creditCardDto) {
        return creditCardResource.create(creditCardDto);
    }

    @PutMapping
    public Mono<CreditCardDto> update(@RequestBody CreditCardDto creditCardDto) {
        return creditCardResource.update(creditCardDto);
    }

    @DeleteMapping
    public Mono<Void> delete(@RequestBody CreditCardDto creditCardDto) {
        return creditCardResource.delete(creditCardDto);
    }

    @GetMapping
    public Flux<CreditCardDto> findAll() {
        return creditCardResource.findAll();
    }
}
