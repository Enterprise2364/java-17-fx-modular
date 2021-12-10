package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GraphicsApp extends Application {

    Calculator calc = new Calculator();

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GraphicsApp.fxml"));
            //BorderPane root = new BorderPane();
            // root.setCenter(createInputPane());
            Scene scene = new Scene(root,800,600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Graphics App");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
