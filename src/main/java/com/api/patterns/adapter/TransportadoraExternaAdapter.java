package com.api.patterns.adapter;

import com.api.patterns.strategy.TransportadoraStrategy;
import org.springframework.stereotype.Component;

/**
 * Adapter que integra a TransportadoraExternaSimulada ao sistema,
 * implementando a interface TransportadoraStrategy.
 */
@Component("transportadoraTerceirizada") // Nome para identificar o Bean no Strategy
public class TransportadoraExternaAdapter implements TransportadoraStrategy {

    private final TransportadoraExternaSimulada transportadoraExterna;

    // Injetamos a dependência da API externa simulada (poderia ser configurado)
    public TransportadoraExternaAdapter() {
        this.transportadoraExterna = new TransportadoraExternaSimulada();
    }

    @Override
    public double calcularFrete(double peso) {
        // Adaptação: Criar o objeto esperado pela API externa
        // Aqui, assumimos que "terceirizada" implica em entrega "NORMAL"
        // Poderíamos ter mais lógica para decidir o tipo de entrega
        DadosEnvio dados = new DadosEnvio(peso, "NORMAL");

        // Adaptação: Chamar o método da API externa com os dados adaptados
        return transportadoraExterna.calcularCustoEnvio(dados);
    }

    @Override
    public String getModalidade() {
        // Adaptação: Retornar o nome esperado pelo sistema
        // Usando o nome definido na anotação @Component para consistência
        return "transportadoraTerceirizada";
    }
} 