package com.onetoimprove.OneToImprove.DTOs;

import com.onetoimprove.OneToImprove.models.Empleado;

import java.time.LocalDate;

public class EmpleadoDTO {
    private long id;
    private String nombre;
    private String cargo;
    private String email;
    private String password;
    private String imagen;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public EmpleadoDTO (Empleado empleado){
        this.id = empleado.getId();
        this.nombre = empleado.getNombre();
        this.cargo = empleado.getCargo();
        this.email = empleado.getEmail();
        this.password = empleado.getPassword();
        this.imagen = empleado.getImagen();
        this.fechaInicio = empleado.getFechaInicio();
        this.fechaFin = empleado.getFechaFin();
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getImagen() {
        return imagen;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
