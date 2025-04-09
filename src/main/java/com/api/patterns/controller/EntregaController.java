package com.api.patterns.controller;


import com.api.patterns.dto.EntregaRequest;
import com.api.patterns.service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entregas")
public class EntregaController {

    @Autowired
    private EntregaService pagamentoService;

    @PostMapping
    public ResponseEntity<?> realizarEntrega(@RequestBody EntregaRequest entregaRequest){
        return ResponseEntity.ok(pagamentoService.calcularEntrega(entregaRequest.getTipo(), entregaRequest.getPeso()));
    }
}
