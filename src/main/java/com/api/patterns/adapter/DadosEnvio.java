package com.api.patterns.adapter;

/**
 * DTO simulado para representar os dados esperados pela API externa.
 */
public class DadosEnvio {
    private double pesoKg;
    private String tipoEntrega; // Ex: "URGENTE", "NORMAL"

    public DadosEnvio(double pesoKg, String tipoEntrega) {
        this.pesoKg = pesoKg;
        this.tipoEntrega = tipoEntrega;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }
} 