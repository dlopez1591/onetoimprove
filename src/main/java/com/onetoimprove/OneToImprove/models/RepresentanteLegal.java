package com.onetoimprove.OneToImprove.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
public class RepresentanteLegal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native")
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

    public RepresentanteLegal() {}

    public RepresentanteLegal(String nombre, String email, String password, LocalDate fechaNacimiento, String DNI, LocalDate fechaAlta, TipoLicencia tipoLicencia, String imagen, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        FechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.fechaAlta = fechaAlta;
        this.tipoLicencia = tipoLicencia;
        this.imagen = imagen;
        this.fechaCaducidad = fechaCaducidad;
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
