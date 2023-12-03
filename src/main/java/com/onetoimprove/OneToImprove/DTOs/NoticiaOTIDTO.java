package com.onetoimprove.OneToImprove.DTOs;

import com.onetoimprove.OneToImprove.models.NoticiaOTI;

import java.time.LocalDate;

public class NoticiaOTIDTO {
    private long id;
    private String titulo;
    private String imagen;
    private String noticia;
    private LocalDate fecha;

    public NoticiaOTIDTO (NoticiaOTI noticiaOTI){
        this.id = noticiaOTI.getId();
        this.titulo = noticiaOTI.getTitulo();
        this.imagen = noticiaOTI.getImagen();
        this.noticia = noticiaOTI.getNoticia();
        this.fecha = noticiaOTI.getFecha();
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


}
