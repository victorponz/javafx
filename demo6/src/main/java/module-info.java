module unlock {
    requires javafx.controls;
    requires javafx.fxml;

    opens unlock to javafx.fxml;
    exports unlock;
}
