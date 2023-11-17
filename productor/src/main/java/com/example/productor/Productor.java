package com.example.productor;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class Productor {

    RabbitTemplate rabbitTemplate;

    public Productor(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendJsonMessage(TransferenciaDTO transferenciaDTO){
        rabbitTemplate.convertAndSend("filaTransferencia", "transferir", transferenciaDTO);
    }
}