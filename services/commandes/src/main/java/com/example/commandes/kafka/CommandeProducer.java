package com.example.commandes.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommandeProducer {

    private final KafkaTemplate<String, CommandeConfirmation> kafkaTemplate;
    public void sendOrderConfirmation(CommandeConfirmation transactionConfirmation) {
        log.info("Sending transaction confirmation");
        Message<CommandeConfirmation> message = MessageBuilder
                .withPayload(transactionConfirmation)
                .setHeader(TOPIC, "transaction-topic")
                .build();

        kafkaTemplate.send(message);
    }

    
}
