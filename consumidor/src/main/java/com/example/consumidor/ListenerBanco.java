package com.example.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerBanco {
    @RabbitListener(queues = {"cola.transferencia"})
    public void procesarTransferencia(String transferenciaDTO) {
        System.out.println("Transferencia recibida: " + transferenciaDTO);
    }
}

