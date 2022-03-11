package com.bootcamp.creditcards.repository;

import com.bootcamp.creditcards.entity.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ICreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {
}
