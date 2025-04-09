package com.api.patterns.strategy;

/**
 * Interface que define o contrato para as estratégias de cálculo de frete.
 */
public interface TransportadoraStrategy {

    /**
     * Calcula o valor do frete com base no peso.
     * @param peso Peso do pacote em kg.
     * @return O valor do frete calculado.
     */
    double calcularFrete(double peso);

    /**
     * Retorna o nome da modalidade de entrega.
     * @return Nome da modalidade.
     */
    String getModalidade();
} 