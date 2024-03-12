module com.example.inventory {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.inventory to javafx.fxml;
    exports com.example.inventory;
    opens com.example.inventory.models;
    exports com.example.inventory.database;
    opens com.example.inventory.database to javafx.fxml;
}