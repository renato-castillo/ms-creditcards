package com.bootcamp.creditcards.util;

import com.bootcamp.creditcards.dto.CreditCardDto;
import com.bootcamp.creditcards.entity.CreditCard;
import org.springframework.beans.BeanUtils;

public abstract class MapperUtil {

    public CreditCardDto convertToDto(CreditCard creditCard) {
        CreditCardDto creditCardDto = new CreditCardDto();
        BeanUtils.copyProperties(creditCard, creditCardDto);

        return creditCardDto;
    }

    public CreditCard convertToEntity(CreditCardDto creditCardDto) {
        CreditCard creditCard = new CreditCard();
        BeanUtils.copyProperties(creditCardDto, creditCard);
        return creditCard;
    }

}
