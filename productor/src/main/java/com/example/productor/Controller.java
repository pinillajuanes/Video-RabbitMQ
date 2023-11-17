package com.example.productor;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Productor productor;

    public Controller(Productor productor) {
        this.productor = productor;
    }
    @PostMapping("/publish")
    public void sendJsonMessage(@RequestBody TransferenciaDTO transferenciaDTO){
        productor.sendJsonMessage(transferenciaDTO);
    }
}
