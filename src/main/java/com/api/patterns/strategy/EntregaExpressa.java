package com.api.patterns.strategy;

import org.springframework.stereotype.Component;

@Component("EXPRESSA")
public class EntregaExpressa implements Entrega {
    private Double valorKg = 8.5;

    @Override
    public Double entregar(Double pesoEmKg) {
        return  pesoEmKg * valorKg;
    }
}
