package model;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String user;
    private transient String password;

    public Persona(String nombre, String user, String password) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("El %s llamado %s tiene el user: %s", this.getClass().getSimpleName(),this.nombre,this.user);
    }
}
