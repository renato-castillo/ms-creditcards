package com.bootcamp.creditcards.repository;

import com.bootcamp.creditcards.entity.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {

    public Flux<CreditCard> findByClientType(String clientType);
}
