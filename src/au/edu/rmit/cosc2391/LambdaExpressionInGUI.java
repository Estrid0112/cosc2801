package au.edu.rmit.cosc2391;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LambdaExpressionInGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the title of the primary stage
        primaryStage.setTitle("A simple button demo");

        // Create a button with the label text as "Ad". Upon clicking the button, print "You win the prize!".
        Button button = new Button("Ad");
        // This is the lambda expression!!!
        button.setOnAction(e -> System.out.println("You win the prize!"));


        // Create a pane and add the button to the pane.
        Pane pane = new Pane();
        pane.getChildren().add(button);

        // Create a scene. Add the pane to the scene. Then add the scene to the primary stage.
        Scene scene = new Scene(pane, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
