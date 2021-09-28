package application;
//Author:      Nick Seyler
//Date:        November 6, 2015
//Description: Displays 5 "Java" texts vertically with a random color and opacity.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class JavaText extends Application
{
   public void start(Stage primaryStage)
   {
      FlowPane pane = new FlowPane(5, 5);
      pane.setPadding(new Insets(18, 5, 5, 5));

      for(int i = 0; i < 5; i++)
      {
         Text text = new Text(i * 20, 0, "Java");
         text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
         text.setRotate(90);
         text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
         pane.getChildren().add(text);
      }

      Scene scene = new Scene(pane, 280, 70);
      primaryStage.setTitle("Fonts");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}