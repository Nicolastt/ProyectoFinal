package model;

import model.Servidor;

public class Configuracion {
    private static Servidor servidor = new Servidor("ServerPoli", "Web");

    public static Servidor getServidor() {
        return servidor;
    }
}

