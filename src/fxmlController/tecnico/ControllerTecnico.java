package fxmlController.tecnico;

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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTecnico implements Initializable {

    @FXML
    private BorderPane bp;

    @FXML
    private Button btnPatch;

    @FXML
    private Button btnSr;

    @FXML
    private Button btnUps;

    @FXML
    private AnchorPane ap;

    @FXML
    void Upss(MouseEvent event) {
        cargarPagina("/fxml/tecnico/Ups");
    }

    @FXML
    void patchPanel(MouseEvent event) {
        cargarPagina("/fxml/tecnico/PatchPanel");
    }

    @FXML
    void sistemaRefrigeracion(MouseEvent event) {
        cargarPagina("/fxml/tecnico/SistemaRefrigeracion");
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
