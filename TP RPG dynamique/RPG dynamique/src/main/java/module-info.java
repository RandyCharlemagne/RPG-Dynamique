module com.example.rpg_dynamique {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.rpg_dynamique to javafx.fxml;
    exports com.example.rpg_dynamique;
}