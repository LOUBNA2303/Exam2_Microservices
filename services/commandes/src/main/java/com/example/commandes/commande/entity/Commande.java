package com.example.commandes.commande.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Commande {
    @Id
    private String id;
    private String name;
    private String amount;
    private String description;

}
