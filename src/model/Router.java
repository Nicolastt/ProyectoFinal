package model;

public class Router {
    // Atributos
    private String nombre;
    private String direccionIP;
    private boolean encendido;

    // Constructor
    public Router(String nombre, String direccionIP) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.encendido = false;
    }

    // Métodos
    public void encender() {
        encendido = true;
        System.out.println("El router " + nombre + " está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El router " + nombre + " está apagado.");
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    @Override
    public String toString() {
        return "Router{" +
                "nombre='" + nombre + '\'' +
                ", direccionIP='" + direccionIP + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
