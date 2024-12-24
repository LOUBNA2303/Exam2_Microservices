package com.example.produit.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document
public class Produit {
    @Id
    private String id;
    private String name;
    private String image;
    private String stock;
}
