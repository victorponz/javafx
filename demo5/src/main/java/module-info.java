module org.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens login.model to javafx.base;
    opens login.security to javafx.base;

    opens login to javafx.fxml;
    exports login;
}
