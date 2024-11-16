package com.unach.museovirtual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unach.museovirtual.models.Artista;
import com.unach.museovirtual.models.Mural;

import java.util.List;


public interface MuralRepository extends JpaRepository<Mural, Long> {
    List<Mural> findByArtista(Artista artista); // Asegúrate de que el método esté definido
}


