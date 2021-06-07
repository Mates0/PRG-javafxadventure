package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    public Button btnforward;
    @FXML
    public Button btnleft;
    @FXML
    public Button btnright;
    @FXML
    public Text maintext;
    @FXML
    public Text subtext;
    @FXML
    public ImageView img;

    public void onBtnForward(ActionEvent actionEvent) {
        maintext.setText("Machine Room");
        subtext.setText("The Machine Room is a relatively narrow area, filled with pipes and machinery. This is a safe area, so Daniel won't encounter any enemy (the Shadow excluded).");
        Image image = new Image("machine.png");
        img.setImage(image);
    }

    public void onBtnLeft(ActionEvent actionEvent) {
        maintext.setText("Guest Room");
        subtext.setText("The Guest Room is the room Daniel stayed in during his time at the Castle. It can be reached from the Back Hall.");
        Image image = new Image("guest.jpg");
        img.setImage(image);
    }

    public void onBtnRight(ActionEvent actionEvent) {

    }
}
