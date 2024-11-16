package com.unach.museovirtual.controllers;

import com.unach.museovirtual.models.Artista;
import com.unach.museovirtual.repositories.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaRepository artistaRepository;

    // Obtener todos los artistas
    @GetMapping("/listArtistas")
    public List<Artista> getAllArtistas() {
        return artistaRepository.findAll();
    }

    // Obtener un artista por ID
    @GetMapping("/artista/{idA}")
    public Artista getArtistaById(@PathVariable Long idA) {
        return artistaRepository.findById(idA).orElse(null);
    }

    // Crear un nuevo artista
    @PostMapping ("/crearArtista")
    public Artista createArtista(@RequestBody Artista artista) {
        return artistaRepository.save(artista);
    }

    // Actualizar un artista existente
    @PutMapping("/actualizarArtista/{idA}")
    public Artista updateArtista(@PathVariable Long idA, @RequestBody Artista artista) {
        artista.setIdA(idA);
        return artistaRepository.save(artista);
    }

    // Eliminar un artista
    @DeleteMapping("/eliminarArtista/{idA}")
    public void deleteArtista(@PathVariable Long idA) {
        artistaRepository.deleteById(idA);
    }
}
