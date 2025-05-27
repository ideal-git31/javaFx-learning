package com.example.myjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloApplication extends Application {
      @Override
      public void start(Stage stage) throws Exception{
          Group root = new Group();
          Scene scene = new Scene(root,700,700,Color.OLIVEDRAB);


          Text text = new Text();
          text.setText("This is a text node");
          text.setX(50);
          text.setY(50);
          text.setFont(Font.font("Verdana",50));
          text.setFill(Color.LIMEGREEN);

          Line line = new Line();
          line.setStartX(150);
          line.setStartY(150);
          line.setEndX(550);
          line.setEndY(150);
          line.setStrokeWidth(4);
          line.setFill(Color.BLACK);
          line.setRotate(35);

          Rectangle rectangle = new Rectangle();
          rectangle.setX(250);
          rectangle.setY(250);
          rectangle.setHeight(200);
          rectangle.setWidth(100);
          rectangle.setFill(Color.GREY);
          rectangle.setStrokeWidth(3);
          rectangle.setStroke(Color.BLACK);

          Polygon triangle = new Polygon();
          triangle.getPoints().setAll(
                  300.0,300.0,
                  400.0,400.0,
                  300.0,400.0
          );
          triangle.setFill(Color.YELLOW);

          Circle circle = new Circle();
          circle.setCenterX(300);
          circle.setCenterY(300);
          circle.setRadius(40);
          circle.setFill(Color.ORANGE);

          /*Image image = new Image("/Users/adarshsingh/IdeaProjects/Adarshjava/MyJavaFx/src/lodu.png");
          ImageView imageview = new ImageView(image);
          imageview.setX(600);
          imageview.setY(600);*/

         // stage.getIcons().add(icon);
         // stage.setTitle("Stage Demo Program yohooooo");
         // stage.setWidth(520);
         // stage.setHeight(520);
          //stage.setResizable(false);

         // stage.setX(50);
         // stage.setY(50);
         // stage.setFullScreen(true);
         // stage.setFullScreenExitHint("you can't escape unless you press q");
         // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

          root.getChildren().add(text);
          root.getChildren().add(line);
          root.getChildren().add(rectangle);
          root.getChildren().add(triangle);
          root.getChildren().add(circle);
         // root.getChildren().add(imageview);
          stage.setScene(scene);
          stage.show();
      }

    public static void main(String[] args) {
        launch(args);
    }
}