package sample;

import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button buttonStart;

    @FXML
    private ImageView logoImage;


    private Stage firstStage;


    public void start() {
        Parent root = null;
        try {
             root = FXMLLoader.load(getClass().getResource("opened.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        firstStage.setScene(new Scene(root, 600, 400));
    }

    public void setStage(Stage stage) {
        firstStage = stage;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        RotateTransition rt = new RotateTransition(Duration.millis(2000), logoImage);
        rt.setToAngle(30);
        rt.setFromAngle(-30);
        rt.setByAngle(0);
        rt.setCycleCount(2);
        rt.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rt.play();
            }
        });
        rt.setAutoReverse(true);
        rt.play();

        System.out.println("Załadowano");
    }
}
