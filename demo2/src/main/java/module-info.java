module helloi18n {
    requires javafx.controls;
    requires javafx.fxml;

    opens helloi18n to javafx.fxml;
    
    exports helloi18n;
}
