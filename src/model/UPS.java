package model;

public class UPS {
    // Atributos
    private String marca;
    private int capacidadVA;
    private boolean activada;

    // Constructor
    public UPS(String marca, int capacidadVA) {
        this.marca = marca;
        this.capacidadVA = capacidadVA;
        this.activada = false;
    }

    // Métodos
    public void activar() {
        activada = true;
        System.out.println("La UPS de marca " + marca + " está activada.");
    }

    public void desactivar() {
        activada = false;
        System.out.println("La UPS de marca " + marca + " está desactivada.");
    }

    public boolean estaActivada() {
        return activada;
    }
}
