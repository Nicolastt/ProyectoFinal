package fxmlController.estudiante;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerCalificaciones implements Initializable {
    @FXML
    private TextArea asignaturasTextArea;

    @FXML
    private Text tituloText;

    @FXML
    private TextArea puntajeTextArea;

    // Puedes agregar más variables FXML según sea necesario para otros elementos en la vista.

    // Método inicializado automáticamente por JavaFX después de cargar la vista FXML.
    @FXML
    public void initialize() {
        // Aquí puedes realizar acciones de inicialización si es necesario.
        // Por ejemplo, configurar el texto del título o cargar datos en los TextAreas.
        tituloText.setText("Calificaciones");
        cargarDatosAsignaturas(); // Llama a un método para cargar los nombres de asignaturas.
        cargarDatosPuntaje(); // Llama a un método para cargar los puntajes de las asignaturas.
    }

    // Agrega métodos para manejar eventos u otras acciones según sea necesario.

    private void cargarDatosAsignaturas() {
        // Simplemente como ejemplo, puedes cargar algunos nombres de asignaturas en el TextArea.
        asignaturasTextArea.setText("Asignatura 1\nAsignatura 2\nAsignatura 3");
    }

    private void cargarDatosPuntaje() {
        // Simplemente como ejemplo, puedes cargar algunos puntajes en el TextArea.
        puntajeTextArea.setText("90\n85\n78");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
