module issuetrackinglite {
    requires javafx.controls;
    requires javafx.fxml;

    opens issuetrackinglite.model to javafx.base;
    opens issuetrackinglite to javafx.fxml;
    exports issuetrackinglite;
}
