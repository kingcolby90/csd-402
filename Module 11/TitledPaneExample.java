//Cking module 11 JAVAFX TitledPane Example

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("TitledPane Example");

        VBox content = new VBox();
        content.getChildren().add(new Label("JavaFX is a modern GUI toolkit."));
        content.getChildren().add(new Label("It supports CSS styling and animations."));

        TitledPane titledPane = new TitledPane("About JavaFX", content);
        titledPane.setExpanded(true); 

        VBox root = new VBox(titledPane);
        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
