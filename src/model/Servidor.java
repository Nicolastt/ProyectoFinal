package model;

public class Servidor {
    private String nombre;
    private String tipo;
    private boolean encendido;

    public Servidor(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(nombre + " ha sido encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(nombre + " ha sido apagado.");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}