package com.example.contactosfx;

import com.example.contactosfx.model.Person;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class ContactViewController {

    @FXML
    Button details_button;

    @FXML
    VBox contact_details_box;

    @FXML
    Label name_label;

    @FXML
    Label mail_label;

    @FXML
    ImageView image_view;

    Person person;

    public void setPerson(Person person) {
        this.person = person;
        name_label.setText(person.getName());
        mail_label.setText(person.getMail());
        image_view.setImage(new Image(person.getImageUrl()));
    }

    @FXML
    public void detailsButtonHover() {
        RotateTransition transition = new RotateTransition(Duration.millis(1000), details_button);
        transition.setFromAngle(0);
        transition.setToAngle(1080);
        transition.play();
    }

    @FXML
    public void detailsButtonOnClick() {
        details_button.setVisible(false);
        details_button.toBack();
        contact_details_box.toFront();
        contact_details_box.setOpacity(0);
        contact_details_box.setVisible(true);
        FadeTransition transition = new FadeTransition(Duration.millis(1000), contact_details_box);
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.play();
    }
}
