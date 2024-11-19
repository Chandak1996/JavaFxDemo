package org.example.beginners.Demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FxmlDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load the FXML file
        System.out.println("FXML Path: " + getClass().getResource("/Styles.css"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
        StackPane root = loader.load();

        // Set up the scene
        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/Styles.css")).toExternalForm());

        // Set up the stage (the application window)
        primaryStage.setTitle("JavaFX Demo Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
