package fxmlController;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

public class ControllerMP implements Initializable {


    @FXML
    private Button btnHW;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnServicios;

    private Calendar fechaHora = Calendar.getInstance();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
