package com.bootcamp.creditcards.service;

import com.bootcamp.creditcards.entity.CreditCard;
import com.bootcamp.creditcards.util.ICRUD;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditCardService extends ICRUD<CreditCard, String> {

    Flux<CreditCard> findByClientType(String clientType);

    Mono<CreditCard> findByName(String name);

    Mono<CreditCard> findByNameAndClientType(String name, String clientType);
}
