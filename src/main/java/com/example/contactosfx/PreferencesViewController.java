package com.example.contactosfx;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

public class PreferencesViewController {

    @FXML
    private ChoiceBox<String> language_picker;

    ResourceBundle res = ConfigUtils.getResourceBundle();

    @FXML
    private void initialize() {
        List<String> languages = new ArrayList<String>();
        languages.add(res.getString("spanish_lang"));
        languages.add(res.getString("english_lang"));
        language_picker.setItems(FXCollections.observableList(languages));
        Properties prop = ConfigUtils.getProperties();
        if (prop.getProperty("lang").equals("es_ES"))
            language_picker.setValue(res.getString("spanish_lang"));
        else if(prop.getProperty("lang").equals("en_US"))
            language_picker.setValue(res.getString("english_lang"));
    }

    @FXML
    private void onLanguageButtonAction(ActionEvent event) {
        Properties prop = ConfigUtils.getProperties();
        if (language_picker.getSelectionModel().getSelectedIndex() == 0) {
            prop.replace("lang", "es_ES");
        }else if(language_picker.getSelectionModel().getSelectedIndex() == 1){
            prop.replace("lang", "en_US");
        }
        Dialog<String> dialog = new Dialog<String>();
        dialog.setTitle(res.getString("warning"));
        dialog.setContentText(res.getString("warning_message"));
        dialog.getDialogPane().getButtonTypes().add(new ButtonType("OK", ButtonBar.ButtonData.OK_DONE));
        ConfigUtils.setProperties(prop);
        dialog.showAndWait();
    }
}
