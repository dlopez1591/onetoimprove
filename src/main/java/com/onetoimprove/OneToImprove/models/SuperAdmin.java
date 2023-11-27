package com.onetoimprove.OneToImprove.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class SuperAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native")
    private long id;
    private String nombre;
    private String cargo;
    private String email;
    private String Password;
    private String imagen;

    public SuperAdmin() {}

    public SuperAdmin(String nombre, String cargo, String email, String password, String imagen) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.email = email;
        Password = password;
        this.imagen = imagen;
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
        return Password;
    }

    public String getImagen() {
        return imagen;
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
        Password = password;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
