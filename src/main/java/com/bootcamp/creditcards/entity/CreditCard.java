package com.bootcamp.creditcards.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class CreditCard extends BaseEntity {

    private String name;

    private String clientType;
}
