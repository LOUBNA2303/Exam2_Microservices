package com.example.produit.controler;

import com.example.produit.entity.Produit;
import com.example.produit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/produits")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @PostMapping
    public ResponseEntity<Produit> ajouterProduit(@RequestBody Produit produit) {
        Produit nouveauProduit = produitService.ajouterProduit(produit);
        return ResponseEntity.ok(nouveauProduit);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produit> mettreAJourProduit(@PathVariable String id, @RequestBody Produit produit) {
        Produit produitMisAJour = produitService.mettreAJourProduit(id, produit);
        return ResponseEntity.ok(produitMisAJour);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> supprimerProduit(@PathVariable String id) {
        produitService.supprimerProduit(id);
        return ResponseEntity.ok("Produit supprimé avec succès.");
    }

    @GetMapping
    public ResponseEntity<List<Produit>> obtenirTousLesProduits() {
        List<Produit> produits = produitService.obtenirTousLesProduits();
        return ResponseEntity.ok(produits);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> obtenirProduitParId(@PathVariable String id) {
        Produit produit = produitService.obtenirProduitParId(id);
        return ResponseEntity.ok(produit);
    }
}
