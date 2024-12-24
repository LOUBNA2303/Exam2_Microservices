package com.example.commandes.commande.repository;

import com.example.commandes.commande.entity.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommadeRepo extends MongoRepository<Commande, String> {
}
