package com.example.produit.repository;

import com.example.produit.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends MongoRepository<Produit, String> {
    boolean existsById(String id);
}
