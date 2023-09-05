package fxmlController.profesor;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerCursos implements Initializable {
    @FXML
    private TextArea listaEstudiantesTextArea;

    @FXML
    private Text tituloText;

    // Puedes agregar más variables FXML según sea necesario para otros elementos en la vista.

    // Método inicializado automáticamente por JavaFX después de cargar la vista FXML.
    @FXML
    public void initialize() {
        // Aquí puedes realizar acciones de inicialización si es necesario.
        // Por ejemplo, configurar el texto del título o cargar datos en el TextArea.
        tituloText.setText("Lista de Estudiantes");
        cargarDatosEstudiantes(); // Llama a un método para cargar los datos de estudiantes en el TextArea.
    }

    // Agrega métodos para manejar eventos u otras acciones según sea necesario.

    private void cargarDatosEstudiantes() {
        // Simplemente como ejemplo, puedes cargar algunos datos en el TextArea.
        listaEstudiantesTextArea.setText("Estudiante 1\nEstudiante 2\nEstudiante 3");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
