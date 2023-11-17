package com.example.productor;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final Productor productor;

    public Controller(Productor productor) {
        this.productor = productor;
    }

    @PostMapping(path = "/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody TransferenciaDTO transferenciaDTO){
        Productor.sendJsonMessage(transferenciaDTO);
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");
    }
}
