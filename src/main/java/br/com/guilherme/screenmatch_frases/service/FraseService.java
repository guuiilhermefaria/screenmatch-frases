package br.com.guilherme.screenmatch_frases.service;

import br.com.guilherme.screenmatch_frases.model.Frase;
import br.com.guilherme.screenmatch_frases.model.FraseDTO;
import br.com.guilherme.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = fraseRepository.obterFraseAleatoria();

        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
