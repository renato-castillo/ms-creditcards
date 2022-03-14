package com.bootcamp.creditcards.service;

import com.bootcamp.creditcards.entity.CreditCard;
import com.bootcamp.creditcards.repository.ICreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditCardServiceImpl implements ICreditCardService {

    @Autowired
    private ICreditCardRepository creditCardRepository;

    @Override
    public Mono<CreditCard> save(CreditCard v) {
        return creditCardRepository.save(v);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return creditCardRepository.deleteById(id);
    }

    @Override
    public Mono<CreditCard> findById(String id) {
        return creditCardRepository.findById(id);
    }

    @Override
    public Flux<CreditCard> findAll() {
        return creditCardRepository.findAll();
    }

    @Override
    public Flux<CreditCard> findByClientType(String clientType) {
        return creditCardRepository.findByClientType(clientType);
    }
}
