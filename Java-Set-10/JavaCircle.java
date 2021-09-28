//Author:      Nick Seyler
//Date:        November 6, 2015
//Description: Displays "WELCOME TO JAVA " in a circle.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class JavaCircle extends Application
{
   public void start(Stage primaryStage)
   {
      Pane pane = new Pane();
      
      String s = "WELCOME TO JAVA ";
      
      Circle circle = new Circle();
      circle.setCenterX(100);
      circle.setCenterY(100);
      circle.setRadius(50);
      
      double degreeChange = 360 / s.length();
      double degrees = 0;
      
      for (int i = 0; i < s.length(); i++)
      {
         //get the x and y position for each letter
         double x = circle.getCenterX() + circle.getRadius() * Math.cos(Math.toRadians(degrees));
         double y = circle.getCenterY() + circle.getRadius() * Math.sin(Math.toRadians(degrees));
         
         Text text = new Text(x, y, s.charAt(i) + "");
         text.setFont(Font.font("Times New Roman", 22));
         text.setFill(Color.BLACK);
         text.setRotate(degrees + 90); //rotate the letter so that it forms around a circle
         
         pane.getChildren().add(text);
         degrees += degreeChange;
      }
   
      Scene scene = new Scene(pane, 200, 200);
      primaryStage.setTitle("Welcome to Java");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}