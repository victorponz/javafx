module issuetrackingbidi {
        requires javafx.controls;
        requires javafx.fxml;

        opens issuetrackingbidi to javafx.fxml;
        opens issuetrackingbidi.model to javafx.base;

        exports issuetrackingbidi;
}
