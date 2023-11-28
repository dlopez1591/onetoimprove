package com.onetoimprove.OneToImprove.DTOs;

import com.onetoimprove.OneToImprove.models.Admin;

public class AdminDTO {
    private long id;
    private String nombre;
    private String cargo;
    private String email;
    private String password;
    private String imagen;

    public AdminDTO(Admin admin){
        this.id = admin.getId();
        this.nombre = admin.getNombre();
        this.cargo = admin.getCargo();
        this.email = admin.getEmail();
        this.password = admin.getPassword();
        this.imagen = admin.getImagen();
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
}
