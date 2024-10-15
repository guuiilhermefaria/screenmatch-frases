package br.com.guilherme.screenmatch_frases.repository;

import br.com.guilherme.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT COUNT(f) FROM Frase f")
    Long countItemsRegisteredInDatabase();

    @Query("SELECT f FROM Frase f ORDER BY RANDOM() LIMIT 1")
    Frase obterFraseAleatoria();
}
