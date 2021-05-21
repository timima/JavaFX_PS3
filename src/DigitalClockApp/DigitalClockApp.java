package DigitalClockApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DigitalClockApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("DigitalClockApp.fxml"));
        primaryStage.setTitle("Digital Clock");
        primaryStage.setScene(new Scene(root, 739, 389));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}