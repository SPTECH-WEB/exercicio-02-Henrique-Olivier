package com.frete.atividadefrete.controller;

import com.frete.atividadefrete.service.FreteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frete")
public class FreteController {

    private final FreteService freteService;

    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping("/calcular")
    public ResponseEntity<String> calcularFrete(@RequestParam String tipo, @RequestParam double peso){
        double valor = freteService.calcular(tipo, peso);
        return ResponseEntity.ok("Frete ("+ tipo +") para " + peso + "Kg: R$ " + valor);
    }
}
