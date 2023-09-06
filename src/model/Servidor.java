package model;

public class Servidor {
    private final String nombre;
    private Thread temperaturaThread;
    private String tipo;
    private boolean encendido;
    private int temperatura; // Cambiado a un entero para representar la temperatura en grados Celsius
    private boolean estaConectado;  // Bandera para indicar si se debe apagar el servidor

    public Servidor(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.encendido = false;
        this.temperatura = 0; // Inicialmente, la temperatura es 0 grados Celsius
        this.temperaturaThread = null;
        this.estaConectado = false;
    }

    public void encender() {
        encendido = true;
        estaConectado = true;
        System.out.println(nombre + " ha sido encendido.");

        // Verificar si el hilo de temperatura ya está en ejecución
        if (temperaturaThread == null || !temperaturaThread.isAlive()) {
            // Crear un nuevo hilo para aumentar la temperatura
            temperaturaThread = new Thread(() -> {
                // Reiniciar la temperatura a cero cuando se enciende el servidor
                temperatura = 0;
                while (encendido && temperatura < 80 && estaConectado) {
                    try {
                        Thread.sleep(10); // Espera 1 segundo
                        temperatura += 1; // Incrementa la temperatura en 1 grado Celsius
                        System.out.println("Temperatura de " + nombre + ": " + temperatura + " grados Celsius");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            temperaturaThread.start();
        }
    }

    public void apagar() {
        encendido = false;
        estaConectado = true; // Establecer la bandera de estaConectado a true
        this.temperatura = 0;
        System.out.println(nombre + " ha sido estaConectado.");
    }

    public int getTemperatura() {
        return temperatura;
    }

    // Método para asignar un sistema de refrigeración al servidor
    public void enfriar() {
        if (encendido && this.temperatura > 28) {
            this.temperatura = 28;
        } else {
            this.temperatura = 0;
        }
    }

    public boolean isEstaConectado() {
        return estaConectado;
    }

    public void setEstaConectado(boolean estaConectado) {
        this.estaConectado = estaConectado;
    }
}
