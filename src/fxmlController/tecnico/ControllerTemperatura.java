package fxmlController.tecnico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.Configuracion;
import model.Servidor;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTemperatura implements Initializable {

    private Servidor servidor;

    @FXML
    private Label temperaturaLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Obtén la instancia del servidor desde la configuración
        servidor = Configuracion.getServidor();
    }

    @FXML
    void verificarTemperatura(ActionEvent event) {
        int temperatura = servidor.getTemperatura();
        temperaturaLabel.setText("Temperatura del servidor: " + temperatura + " grados Celsius");
    }

    @FXML
    void enfriar(ActionEvent event) {
        servidor.enfriar();
        temperaturaLabel.setText("Enfriando servidor...");
    }
}

