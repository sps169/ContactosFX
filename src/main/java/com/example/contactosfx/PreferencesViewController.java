package com.example.contactosfx;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;
import java.util.List;

public class PreferencesViewController {

    @FXML
    private ChoiceBox<String> language_picker;

    @FXML
    private Button set_language_button;

    @FXML
    private void initialize() {
        List<String> languajes = new ArrayList<String>();
        languajes.add("Español");
        languajes.add("Inglés");
        language_picker.setItems(FXCollections.observableList(languajes));
    }

    @FXML
    private void onLanguageButtonAction(ActionEvent event) {
        
    }
}
