package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    public Button btn;
    @FXML
    public Text text;

    public void btnlevel2(ActionEvent actionEvent) {
        text.setText("Level 2");
    }

    public void btnlevel3(ActionEvent actionEvent) {
        text.setText("Level 3");
    }
}
