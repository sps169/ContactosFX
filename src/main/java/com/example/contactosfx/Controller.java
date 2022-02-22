package com.example.contactosfx;

import com.example.contactosfx.model.Person;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Controller {
    @FXML
    private VBox menuBox;

    @FXML
    private Button preferences_button;

    @FXML
    private Button exit_button;

    @FXML
    private StackPane preferencesView;

    @FXML
    private PreferencesViewController preferencesViewController;

    @FXML
    private StackPane contactView;

    @FXML
    private ContactViewController contactViewController;

    @FXML
    public void initialize () {
        menuBox.toFront();
    }

    @FXML
    protected void onMenuEnterHover() {
        if (menuBox.getTranslateX() != 0) {
            TranslateTransition menuAnimation = new TranslateTransition(Duration.millis(100), menuBox);
            menuAnimation.setFromX(-150);
            menuAnimation.setToX(0);
            menuAnimation.play();
        }
    }

    @FXML
    protected void onMenuExitHover() {
        if (menuBox.getTranslateX() != -150) {
            TranslateTransition menuAnimation = new TranslateTransition(Duration.millis(100), menuBox);
            menuAnimation.setFromX(0);
            menuAnimation.setToX(-150);
            menuAnimation.play();
        }
    }

    @FXML
    protected void onPreferencesButtonClick() {
        contactView.setVisible(false);
        preferencesView.toFront();
        menuBox.toFront();
        preferencesView.setVisible(true);
    }

    @FXML
    protected void onUser1Click() {
        contactViewController.setPerson(new Person("Rey Alfredo", "rey@babilonia.com", "king.png"));
        onUserClick();
    }

    @FXML
    protected void onUser2Click() {
        contactViewController.setPerson(new Person("Rey Laso", "principe@babilonia.com", "prince.png"));
        onUserClick();
    }

    @FXML
    protected void onUser3Click() {
        contactViewController.setPerson(new Person("Rey Sufi", "principe2@babilonia.com", "prince.png"));
        onUserClick();
    }

    private void onUserClick() {
        contactView.setVisible(true);
        preferencesView.setVisible(false);
        contactView.toFront();
        menuBox.toFront();
    }

    @FXML
    protected void onExitClick() {
        System.exit(0);
    }
}