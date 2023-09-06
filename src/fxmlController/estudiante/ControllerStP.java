package fxmlController.estudiante;


import model.Estudiante;
import model.HoraFecha;
import archivos.ArchivoSerializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Persona;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ControllerStP implements Initializable {
    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    private Button btnCalificaciones;

    @FXML
    private Button btnDatos;

    @FXML
    private Button btnMaterias;

    private Persona per;
    private HoraFecha horaFecha = new HoraFecha();
    private ArchivoSerializable archSerial = new ArchivoSerializable();
    ControllerStDatos ctrlStDatos = new ControllerStDatos();

    @FXML
    private void calificaciones(MouseEvent event) {

        cargarPagina("/fxml/estudiante/Calificaciones");
    }

    @FXML
    private void calificacionesAction(ActionEvent event) {
        archSerial.escribirArchivoSerial(per, horaFecha, "Ingresó a la pestaña de Calificaciones");
    }

    @FXML
    private void datos(MouseEvent event) {
        cargarPagina("/fxml/estudiante/Datos");
    }

    @FXML
    private void datosAction(ActionEvent event) {
        ctrlStDatos.setDatos((Estudiante) per);
        archSerial.escribirArchivoSerial(per, horaFecha, "Ingresó a Datos de estudiante");
    }

    @FXML
    private void materias(MouseEvent event) {

        cargarPagina("/fxml/estudiante/Materias");
    }

    @FXML
    private void materiasAction(ActionEvent event) {
        archSerial.escribirArchivoSerial(per, horaFecha, "Ingresó a la pestaña de Materias");
    }

    private void cargarPagina(String pagina) {
        Parent root = null;

        try {

            root = FXMLLoader.load(getClass().getResource(pagina + ".fxml"));
        }catch (IOException e){

            System.out.println(e.getMessage());
        }

        bp.setCenter(root);

    }

    public void setPer(Persona per) {
        this.per = per;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
