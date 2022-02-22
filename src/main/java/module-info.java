module com.example.contactosfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires lombok;

    opens com.example.contactosfx to javafx.fxml;
    exports com.example.contactosfx;
}