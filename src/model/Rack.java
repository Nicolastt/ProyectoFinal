package model;

import java.util.ArrayList;
import java.util.List;

public class Rack {
    private int numeroRack;
    private List<Servidor> servidores;
    private int capacidadMaxima;

    public Rack(int numeroRack, int capacidadMaxima) {
        this.numeroRack = numeroRack;
        this.capacidadMaxima = capacidadMaxima;
        this.servidores = new ArrayList<>();
    }

    public void agregarServidor(Servidor servidor) {
        if (servidores.size() < capacidadMaxima) {
            servidores.add(servidor);
        } else {
            System.out.println("El rack está lleno. No se puede agregar más servidores.");
        }
    }

    public List<Servidor> getServidores() {
        return servidores;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}