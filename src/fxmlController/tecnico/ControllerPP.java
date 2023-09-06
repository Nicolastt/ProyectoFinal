package fxmlController.tecnico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Configuracion;
import model.Servidor;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPP implements Initializable {
    public Label textoPP;
    private Servidor servidor;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Obtén la instancia del servidor desde la configuración
        servidor = Configuracion.getServidor();
    }


    @FXML
    void resetearCon(ActionEvent event) {
        servidor.setEstaConectado(true);
        textoPP.setText("Se han restablecido las conexiones");
    }

    @FXML
    void verificarConexiones(ActionEvent event) {
        boolean estado = servidor.isEstaConectado();
        String mensaje = "El servidor " + (estado ? "está correctamente conectado" : "está mal conectado");
        textoPP.setText(mensaje);
    }

}
