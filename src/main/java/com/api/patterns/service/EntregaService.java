package com.api.patterns.service;

import com.api.patterns.strategy.Entrega;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EntregaService {

    private final Map<String, Entrega> estrategias;


    public EntregaService(Map<String, Entrega> estrategias) {
        this.estrategias = estrategias;
    }

    public Double calcularEntrega(String tipo, Double peso){
        System.out.println(estrategias.get(tipo.toUpperCase()));
        Entrega strategy = estrategias.get(tipo.toUpperCase());
        if(strategy == null){
            throw new IllegalArgumentException("Tipo de entrega inválida: " + tipo);
        }
        return strategy.entregar(peso);
    }
}
