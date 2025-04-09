package com.api.patterns.strategy;

import org.springframework.stereotype.Component;

    @Component("ECONOMICA")
public class EntregaEconomica implements Entrega{
    double valorKg = 6.0;
    @Override
    public Double entregar(Double pesoEmKg) {
        return pesoEmKg * valorKg;
    }
}
