module DemoUI.main {
    requires javafx.controls;
    requires javafx.fxml;

    // Open the controller package to javafx.fxml for reflection
    opens org.example.beginners.Demo to javafx.fxml;

    exports org.example.beginners.Demo;
}