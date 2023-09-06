package fxmlController.profesor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerProfesor implements Initializable {

    @FXML
    private BorderPane bp;

    @FXML
    private Button btnShowEstudiantes;

    @FXML
    private Button btnCursos;

    @FXML
    private AnchorPane ap;

    @FXML
    void ActionEstudiantes(ActionEvent event){

    }

    @FXML
    void ActionCursos(ActionEvent event) {

    }

    @FXML
    void cursos(MouseEvent event) {
        cargarPagina("/fxml/profesor/Cursos");

    }

    @FXML
    void estudiantes(MouseEvent event) {
        cargarPagina("/fxml/profesor/Estudiantes");
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
