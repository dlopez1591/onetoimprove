package com.onetoimprove.OneToImprove.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
public class NoticiaOTI {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native")
    private long id;
    private String titulo;
    private String imagen;
    private String noticia;
    private LocalDate fecha;

    public NoticiaOTI() {}

    public NoticiaOTI(String titulo, String imagen, String noticia, LocalDate fecha) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public String getNoticia() {
        return noticia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
