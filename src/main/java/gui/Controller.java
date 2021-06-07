package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private int count = 0;

    public void onBtnForward(ActionEvent actionEvent) {
        if (count == -1) {
            maintext.setText("Machine Room");
            subtext.setText("The Machine Room is a relatively narrow area, filled with pipes and machinery. This is a safe area, so Daniel won't encounter any enemy.");
            Image image = new Image("machine.png");
            img.setImage(image);
            btnright.setDisable(true);
            count--;
        }
        if (count == 0) {
            maintext.setText("Choir");
            subtext.setText("The Choir was used for torture and contains three rooms, each of which has a different torture device: an Iron Maiden, a Torture Wheel and a Brazen Bull.");
            Image image = new Image("choir.jpg");
            img.setImage(image);
            btnright.setDisable(true);
            btnleft.setDisable(true);
        }
        if (count == 1) {
            maintext.setText("Transept");
            subtext.setText("The Transept consists of a large main chamber, three torture rooms, and a small room at the top of the spiral staircase, presumably Alexander's study.");
            Image image = new Image("transept.jpg");
            img.setImage(image);
            btnright.setDisable(true);
            btnleft.setDisable(true);
        }
        System.out.println(count);
    }

    public void onBtnLeft(ActionEvent actionEvent) {
        if (count == 0) {
            maintext.setText("Guest Room");
            subtext.setText("The Guest Room is the room Daniel stayed in during his time at the Castle. It can be reached from the Back Hall.");
            Image image = new Image("guest.jpg");
            img.setImage(image);
            btnleft.setDisable(true);
            count--;
        }
        if (count == 1) {
            maintext.setText("Home");
            subtext.setText("Welcome to my game.");
            Image image = new Image("home.jpg");
            img.setImage(image);
            btnleft.setDisable(false);
            btnright.setDisable(false);
            count--;
        }
        System.out.println(count);
    }

    public void onBtnRight(ActionEvent actionEvent) {
        System.out.println(count);
        if (count == -1) {
            maintext.setText("Home");
            subtext.setText("Welcome to my game.");
            Image image = new Image("home.jpg");
            img.setImage(image);
            btnleft.setDisable(false);
            count++;
        }
        if (count == 0) {
            maintext.setText("Sewers");
            subtext.setText("The Sewer has become contaminated with toxic fungi, you will need to be vaccinated with blood from a corpse located in the Morgue in order to pass through.");
            Image image = new Image("sewers.jpg");
            img.setImage(image);
            btnright.setDisable(true);
            count++;
        }
    }
}
