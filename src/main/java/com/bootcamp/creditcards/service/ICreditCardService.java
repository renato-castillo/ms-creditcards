package com.bootcamp.creditcards.service;

import com.bootcamp.creditcards.entity.CreditCard;
import com.bootcamp.creditcards.util.ICRUD;
import reactor.core.publisher.Flux;

public interface ICreditCardService extends ICRUD<CreditCard, String> {

    Flux<CreditCard> findByClientType(String clientType);
}
