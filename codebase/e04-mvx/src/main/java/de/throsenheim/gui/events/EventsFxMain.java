package de.throsenheim.gui.events;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point for the eventsFX GUI.
 * This class provides the necessary main method and loads the FXML GUI.
 *
 * @author dominik.haas
 */
public class EventsFxMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(this.getClass().getResource("EventForm.fxml"));
        Scene scene = new Scene(parent, 800, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
