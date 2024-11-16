package com.unach.museovirtual.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Mural {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idM;  // Identificador del mural

    private String titulo;  // Título del mural
    private String ap;  // Autor del mural
    private String dimensiones;  // Dimensiones del mural
    private String materiales;  // Materiales usados
    private Double rating;  // Calificación del mural

    @ManyToOne
    @JoinColumn(name = "idA", referencedColumnName = "idA")
    private Artista artista;


    // Getters y setters

    public Long getIdM() {
        return idM;
    }

    public void setIdM(Long idM) {
        this.idM = idM;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
