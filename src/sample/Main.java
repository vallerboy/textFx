package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("start.fxml"));
        Parent root = (Parent)loader.load();
        controller = (Controller)loader.getController();
        controller.setStage(primaryStage);


        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.initStyle(StageStyle.UTILITY);


        primaryStage.setTitle("Akademia Kodu");
        Scene firstScene = new Scene(root, 600, 400);
        firstScene.getStylesheets().add("sample/resources/style.css");
        primaryStage.setScene(firstScene);
        primaryStage.show();




        controller.setStage(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
