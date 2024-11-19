package org.example.beginners.Demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label label;

    @FXML
    public void handleButtonClick() {
        // Show an alert when the button is clicked
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Button Clicked");
        alert.setHeaderText(null);
        alert.setContentText("You clicked the button!");
        alert.showAndWait();

        // Change the label text
        label.setText("Button clicked!");
    }
}
