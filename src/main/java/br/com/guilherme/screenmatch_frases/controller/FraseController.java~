package br.com.guilherme.screenmatch_frases.controller;

import br.com.guilherme.screenmatch_frases.model.FraseDTO;
import br.com.guilherme.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO getFrases() {
        return fraseService.obterFraseAleatoria();
    }
}
