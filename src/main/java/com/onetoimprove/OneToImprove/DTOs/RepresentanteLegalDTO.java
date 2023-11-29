package com.onetoimprove.OneToImprove.DTOs;

import com.onetoimprove.OneToImprove.models.RepresentanteLegal;
import com.onetoimprove.OneToImprove.models.TipoLicencia;

import java.time.LocalDate;

public class RepresentanteLegalDTO {
    private long id;
    private String nombre;
    private String email;
    private String password;
    private LocalDate FechaNacimiento;
    private String DNI;
    private LocalDate fechaAlta;
    private TipoLicencia tipoLicencia;
    private String imagen;
    private LocalDate fechaCaducidad;

    public RepresentanteLegalDTO(RepresentanteLegal representanteLegal){
        this.id = representanteLegal.getId();
        this.nombre = representanteLegal.getNombre();
        this.email = representanteLegal.getEmail();
        this.password = representanteLegal.getPassword();
        this.FechaNacimiento = representanteLegal.getFechaNacimiento();
        this.DNI = representanteLegal.getDNI();
        this.fechaAlta = representanteLegal.getFechaAlta();
        this.tipoLicencia = representanteLegal.getTipoLicencia();
        this.imagen = representanteLegal.getImagen();
        this.fechaCaducidad = representanteLegal.getFechaCaducidad();
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public String getImagen() {
        return imagen;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
