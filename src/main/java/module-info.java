module com.megasae.megasae {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.megasae.megasae to javafx.fxml;
    exports com.megasae.megasae;
}