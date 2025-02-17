package duke.taskmanagement;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//Solution below adapted by https://se-education.org/guides/tutorials/javaFxPart4.html

/**
 * A GUI for Duke using FXML.
 */
public class Main extends Application {

    /**
     * The main method to start the Duke GUI application.
     *
     * @param stage The primary stage for the Duke application's GUI.
     */
    @Override
    public void start(Stage stage) {
        assert stage != null : "stage should not be null when starting an application on javaFx";
        Duke duke = new Duke(stage);
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setDuke(duke);
            fxmlLoader.<MainWindow>getController().greetUser();
            stage.setTitle("Duke");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}