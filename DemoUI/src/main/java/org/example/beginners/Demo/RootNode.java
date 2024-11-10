package org.example.beginners.Demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RootNode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(createContents(),300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Region createContents() {
        return new StackPane(new Text("Hello World"));
    }
}
