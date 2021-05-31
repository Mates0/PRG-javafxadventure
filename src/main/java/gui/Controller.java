package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    public Button btnCalculate;
    @FXML
    public TextField input1;
    @FXML
    public TextField input2;
    @FXML
    public ChoiceBox operator;

    public void onCalculate(ActionEvent actionEvent) {

    }

    public void onOperatorSelected(MouseEvent mouseEvent) {
        operator.getItems().add("+");
        operator.getItems().add("-");
        operator.getItems().add("*");
        operator.getItems().add("/");
    }
}
