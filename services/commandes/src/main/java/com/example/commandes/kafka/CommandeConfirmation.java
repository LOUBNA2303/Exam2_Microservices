package com.example.commandes.kafka;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CommandeConfirmation(
        String commandeId, // ID unique de la notification
        BigDecimal amount // Montant

) {
}
