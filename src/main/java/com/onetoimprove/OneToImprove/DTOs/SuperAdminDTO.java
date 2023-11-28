package com.onetoimprove.OneToImprove.DTOs;

import com.onetoimprove.OneToImprove.models.SuperAdmin;

public class SuperAdminDTO {
    private long id;
    private String nombre;
    private String cargo;
    private String email;
    private String password;
    private String imagen;

    public SuperAdminDTO(SuperAdmin superAdmin){
        this.id = superAdmin.getId();
        this.nombre = superAdmin.getNombre();
        this.cargo = superAdmin.getCargo();
        this.email = superAdmin.getEmail();
        this.password = superAdmin.getPassword();
        this.imagen = superAdmin.getImagen();
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
}
