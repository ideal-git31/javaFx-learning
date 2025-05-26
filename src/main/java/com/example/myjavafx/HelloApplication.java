package com.example.myjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloApplication extends Application {
      @Override
      public void start(Stage stage) throws Exception{
          Group root = new Group();
          Scene scene = new Scene(root,Color.BLUE);

         // Image icon = new Image("my.png");
         // stage.getIcons().add(icon);
          stage.setTitle("Stage Demo Program yohooooo");
          stage.setWidth(520);
          stage.setHeight(520);
          //stage.setResizable(false);

         // stage.setX(50);
         // stage.setY(50);
          stage.setFullScreen(true);
          stage.setFullScreenExitHint("you can't escape unless you press q");
          stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
          stage.setScene(scene);
          stage.show();
      }

    public static void main(String[] args) {
        launch(args);
    }
}