package fxmlController.estudiante;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import model.Estudiante;
import model.Persona;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerStDatos implements Initializable {
    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCUnico;

    @FXML
    private TextField txtCarrera;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtSemestre;

    void setDatos(Estudiante estudiante){
        txtNombre.setText(estudiante.getNombre());
        txtCarrera.setText(estudiante.getCarrera());
        txtCUnico.setText(estudiante.getCodigoUnico());
        txtSemestre.setText(estudiante.getSemestre());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
