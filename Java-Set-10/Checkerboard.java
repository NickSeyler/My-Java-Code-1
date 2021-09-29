//Author:      Nick Seyler
//Date:        November 6, 2015
//Description: Displays a checkerboard.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application
{
   public void start(Stage primaryStage)
   {
   
      Pane pane = new Pane();
      
      for(int i = 0; i < 8; i++)
         for (int j = 0; j < 8; j++)
         {
            Rectangle r = new Rectangle(i * 25, j * 25, 25, 25);
            if (i % 2 == 0 && j % 2 == 1 || i % 2 == 1 && j % 2 == 0) //if this square is in an even column and an odd row, or this square is in an odd column and even row...
            {
               r.setFill(Color.BLACK);
               pane.getChildren().add(r);
            }
            else
            {
               r.setFill(Color.WHITE);
               pane.getChildren().add(r);
            }
         }
      
      Scene scene = new Scene(pane, 200, 200);
      primaryStage.setTitle("Checkerboard");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}