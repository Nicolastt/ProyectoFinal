package model;

public class SistemaRefrigeracion {
    private String tipo;
    private int capacidadEnfriamiento;
    private boolean activado;

    public SistemaRefrigeracion(String tipo, int capacidadEnfriamiento) {
        this.tipo = tipo;
        this.capacidadEnfriamiento = capacidadEnfriamiento;
        this.activado = false;
    }

    public void activar() {
        activado = true;
        System.out.println("El sistema de refrigeración de tipo " + tipo + " ha sido activado.");
    }

    public void desactivar() {
        activado = false;
        System.out.println("El sistema de refrigeración de tipo " + tipo + " ha sido desactivado.");
    }

    public boolean estaActivado() {
        return activado;
    }
}






