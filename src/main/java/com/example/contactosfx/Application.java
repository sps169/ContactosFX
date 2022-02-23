package com.example.contactosfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        // La internacionalizacion del programa se encontrara en resources, dentro de una carpeta "i18n".
        ResourceBundle resourceBundle = ConfigUtils.getResourceBundle();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"), resourceBundle);
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle(resourceBundle.getString("title"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}