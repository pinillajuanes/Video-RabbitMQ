package com.example.productor;

import lombok.Data;

@Data
public class TransferenciaDTO {
    private String origen;
    private String destino;
    private double monto;

    public TransferenciaDTO(String origen, String destino, double monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }
}
