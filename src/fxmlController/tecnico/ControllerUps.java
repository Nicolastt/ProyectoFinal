package fxmlController.tecnico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import model.Configuracion;
import model.Servidor;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerUps implements Initializable {


    private Servidor servidor;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Obtén la instancia del servidor desde la configuración
        servidor = Configuracion.getServidor();
    }
    @FXML
    public Label onOffLabel;

    @FXML
    void ApagarServer(ActionEvent event) {
        servidor.apagar();
        onOffLabel.setText("Servidor Apagado");
    }

    @FXML
    void encenderServer(ActionEvent event) {
        onOffLabel.setText("Servidor Encendido");
        servidor.encender();
    }

}
