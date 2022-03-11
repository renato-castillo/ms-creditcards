package com.bootcamp.creditcards.resource;

import com.bootcamp.creditcards.dto.CreditCardDto;
import com.bootcamp.creditcards.entity.CreditCard;
import com.bootcamp.creditcards.service.ICreditCardService;
import com.bootcamp.creditcards.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class CreditCardResource extends MapperUtil {

    @Autowired
    private ICreditCardService creditCardService;

    public Mono<CreditCardDto> create(CreditCardDto creditCardDto) {

        CreditCard creditCard = convertToEntity(creditCardDto);

        creditCard.setCreatedAt(LocalDateTime.now());

        return creditCardService.save(creditCard)
                .map(x -> convertToDto(x));
    }

    public Mono<CreditCardDto> update(CreditCardDto creditCardDto) {

        return creditCardService.findById(creditCardDto.getId())
                .switchIfEmpty(Mono.error(new Exception()))
                .flatMap(x -> {
                    CreditCard creditCard = convertToEntity(creditCardDto);
                    creditCard.setUpdatedAt(LocalDateTime.now());

                    return creditCardService.save(creditCard).map(y -> convertToDto(y));
                });
    }

    public Mono<Void> delete(CreditCardDto creditCardDto) {
        return creditCardService.findById(creditCardDto.getId())
                .switchIfEmpty(Mono.error(new Exception()))
                .flatMap(x -> creditCardService.deleteById(creditCardDto.getId()));
    }

    public Flux<CreditCardDto> findAll() {

        return creditCardService.findAll()
                .map(x -> convertToDto(x));
    }
}
