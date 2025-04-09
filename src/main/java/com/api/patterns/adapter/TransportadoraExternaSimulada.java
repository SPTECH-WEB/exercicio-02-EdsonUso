package com.api.patterns.adapter;

/**
 * Simulação de uma API de transportadora externa com uma interface incompatível.
 */
public class TransportadoraExternaSimulada {

    /**
     * Método simulado que calcula o custo do envio.
     * Espera os dados em um formato específico (DadosEnvio).
     * @param dados Dados do envio contendo peso e tipo de entrega.
     * @return Custo do envio calculado pela API externa.
     */
    public double calcularCustoEnvio(DadosEnvio dados) {
        // Lógica de cálculo simulada e diferente
        double taxaBase;
        if ("URGENTE".equalsIgnoreCase(dados.getTipoEntrega())) {
            taxaBase = 20.0;
        } else {
            taxaBase = 10.0;
        }
        double custoPorKg = 3.5;
        return taxaBase + (dados.getPesoKg() * custoPorKg);
    }

    public String getNomeTransportadora() {
        return "Transportadora Externa XPTO";
    }
} 