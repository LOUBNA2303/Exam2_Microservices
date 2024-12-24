package com.example.produit.service;

import com.example.produit.entity.Produit;
import com.example.produit.repository.ProduitRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProduitService {

    @Autowired
    private ProduitRepo produitRepository;

    public Produit ajouterProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit mettreAJourProduit(String id, Produit produit) {
        Optional<Produit> produitExistant = produitRepository.findById(id);
        if (produitExistant.isPresent()) {
            Produit produitAMettreAJour = produitExistant.get();
            produitAMettreAJour.setName(produit.getName());
            produitAMettreAJour.setImage(produit.getImage());
            produitAMettreAJour.setStock(produit.getStock());
            return produitRepository.save(produitAMettreAJour);
        } else {
            throw new RuntimeException("Produit avec l'ID " + id + " introuvable.");
        }
    }

    public void supprimerProduit(String id) {
        if (produitRepository.existsById(id)) {
            produitRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produit avec l'ID " + id + " introuvable.");
        }
    }

    public List<Produit> obtenirTousLesProduits() {
        return produitRepository.findAll();
    }

    public Produit obtenirProduitParId(String id) {
        return produitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit avec l'ID " + id + " introuvable."));
    }
}
