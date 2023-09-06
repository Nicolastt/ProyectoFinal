package fxmlController;

import fxmlController.estudiante.ControllerStP;
import model.HoraFecha;
import alertas.MsgAlerta;
import archivos.ArchivoSerializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ControllerLog implements Initializable {

    @FXML
    private Button btnIngreso;

    @FXML
    private Hyperlink hylFPass;

    @FXML
    private BorderPane rootP;

    @FXML
    private AnchorPane subRootP;

    @FXML
    private AnchorPane subRootP1;

    @FXML
    private PasswordField txtPass;

    @FXML
    private TextField txtUsuario;
    private MsgAlerta alerta = new MsgAlerta();
    private HoraFecha horaFecha = new HoraFecha();
    private ArchivoSerializable archSerial = new ArchivoSerializable();
    private ControllerStP controllerStP = new ControllerStP();

    @FXML
    void actionIngreso(ActionEvent event) {
        String usuarioIngresado = txtUsuario.getText();
        String passwordIngresado = txtPass.getText();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\WorkSpace\\ProyectoFinal\\src\\DB\\BaseDeDatos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(","); // Suponiendo que los datos están separados por comas en el archivo.
                if (partes.length == 4) { // Asumiendo que hay cuatro partes: nombre, usuario, contraseña y rol
                    String nombre = partes[0];
                    String usuario = partes[1];
                    String password = partes[2];
                    String rol = partes[3];

                    if (usuarioIngresado.equals(usuario) && passwordIngresado.equals(password)) {
                        // Usuario autenticado correctamente
                        archSerial.escribirArchivoSerial(new Persona(nombre, usuario, password), horaFecha, "Ingresó al sistema\n");
                        controllerStP.setPer(new Persona(nombre, usuario, password));
                        btnIngreso.getScene().getWindow().hide();
                        Stage main = new Stage();
                        Parent root = null;

                        // Tomar acciones específicas en función del rol del usuario
                        switch (rol) {
                            case "Estudiante":

                                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/estudiante/StudentPage.fxml")));
                                break;
                            case "Profesor":
                                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/profesor/MenuProfesor.fxml")));
                                break;
                            case "Técnico":
                                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/tecnico/MenuTecnico.fxml")));
                                break;
                            default:
                                break;
                        }

                        if (root != null) {
                            Scene scene = new Scene(root);
                            main.setScene(scene);
                            main.show();
                        } else {
                            alerta.setMensaje("Tipo de usuario no reconocido");
                        }

                        return; // Salir del bucle cuando el usuario se autentica correctamente.
                    }
                }
            }
            // Si llega aquí, significa que el usuario no se encontró en el archivo.
            alerta.setMensaje("Usuario o contraseña incorrecto");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
