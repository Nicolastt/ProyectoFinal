package alertas;

import javafx.scene.control.Alert;

public class MsgAlerta {

    public void setMensaje(String mensaje){
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setHeaderText("Importante");
        alerta.setContentText(mensaje);
        alerta.show();
    }
}