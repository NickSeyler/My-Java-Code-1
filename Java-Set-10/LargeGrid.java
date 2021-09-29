//Author:      Nick Seyler
//Date:        November 6, 2015
//Description: Displays a 10 x 10 grid of textfields with either 0 or 1

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LargeGrid extends Application
{
   public void start(Stage primaryStage)
   {
      GridPane pane = new GridPane();
      
      for (int i = 0; i < 10; i++)
         for (int j = 0; j < 10; j++)
         {
            TextField tf = new TextField();
            tf.setPrefColumnCount(1);
            tf.setText((int)(Math.random() * 2) + "");
            pane.add(tf, i, j);
         }
      
      Scene scene = new Scene(pane);
      primaryStage.setTitle("0 or 1 Matrix");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}