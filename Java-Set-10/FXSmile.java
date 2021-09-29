//Author:      Nick Seyler
//Date:        November 12, 2015
//Description: Displays a smiley face.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FXSmile extends Application
{
   public void start(Stage primaryStage)
   {
      Pane pane = new Pane();
      
      Circle head = new Circle(100, 100, 75);
      head.setFill(null);
      head.setStroke(Color.BLACK);
      
      Circle pupil1 = new Circle(0, 0, 10);
      pupil1.centerXProperty().bind(head.centerXProperty().subtract(30));
      pupil1.centerYProperty().bind(head.centerYProperty().subtract(30));
      
      Circle pupil2 = new Circle(0, 0, 10);
      pupil2.centerXProperty().bind(head.centerXProperty().add(30));
      pupil2.centerYProperty().bind(head.centerYProperty().subtract(30));
      
      Ellipse eye1 = new Ellipse(0, 0, 20, 15);
      eye1.setFill(null);
      eye1.setStroke(Color.BLACK);
      eye1.centerXProperty().bind(pupil1.centerXProperty());
      eye1.centerYProperty().bind(pupil1.centerYProperty());
      
      Ellipse eye2 = new Ellipse(0, 0, 20, 15);
      eye2.setFill(null);
      eye2.setStroke(Color.BLACK);
      eye2.centerXProperty().bind(pupil2.centerXProperty());
      eye2.centerYProperty().bind(pupil2.centerYProperty());
      
      Polygon triangle = new Polygon(100, 80, 80, 120, 120, 120);
      triangle.setFill(null);
      triangle.setStroke(Color.BLACK);
      
      Arc smile = new Arc(0, 0, 40, 15, 0, -180);
      smile.setFill(null);
      smile.setStroke(Color.BLACK);
      smile.setType(ArcType.OPEN);
      smile.centerXProperty().bind(head.centerXProperty());
      smile.centerYProperty().bind(head.centerYProperty().add(30));
      
      
      pane.getChildren().addAll(head, pupil1, pupil2, eye1, eye2, triangle, smile);
      
      
      
      Scene scene = new Scene(pane, 200, 200);
      primaryStage.setTitle("Face");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}