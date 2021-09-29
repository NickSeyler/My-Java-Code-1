//Author:      Nick Seyler
//Date:        November 11, 2015
//Description: A Simple calculator.
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Collections;

public class FXCalculator extends Application
{
   public void start(Stage primaryStage)
   {
      BorderPane pane = new BorderPane();
      HBox hPane = new HBox();
      HBox hPane2 = new HBox();
      hPane2.setAlignment(Pos.CENTER);
      pane.setTop(hPane);
      pane.setBottom(hPane2);
      pane.setPadding(new Insets(5, 5, 5, 5));
      
      Label label1 = new Label("Number 1: ");
      Label label2 = new Label(" Number 2: ");
      Label label3 = new Label(" Result: ");
      
      TextField tfNum1 = new TextField();
      tfNum1.setPrefColumnCount(5);
      TextField tfNum2 = new TextField();
      tfNum2.setPrefColumnCount(5);
      TextField tfTotal = new TextField();
      tfTotal.setPrefColumnCount(5);
      tfTotal.setEditable(false);
      
      Button add = new Button("Add");
      add.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent e)
         {
            double num1 = Double.parseDouble(tfNum1.getText());
            double num2 = Double.parseDouble(tfNum2.getText());
            tfTotal.setText(num1 + num2 + "");  
         }
      });
      
      Button subtract = new Button("Subtract");
      subtract.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent e)
         {
            double num1 = Double.parseDouble(tfNum1.getText());
            double num2 = Double.parseDouble(tfNum2.getText());
            tfTotal.setText(num1 - num2 + "");  
         }
      });
      
      Button multiply = new Button("Multiply");
      multiply.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent e)
         {
            double num1 = Double.parseDouble(tfNum1.getText());
            double num2 = Double.parseDouble(tfNum2.getText());
            tfTotal.setText(num1 * num2 + "");  
         }
      });
      
      Button divide = new Button("Divide");
      divide.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent e)
         {
            double num1 = Double.parseDouble(tfNum1.getText());
            double num2 = Double.parseDouble(tfNum2.getText());
            tfTotal.setText(num1 / num2 + "");  
         }
      });
      
      hPane.getChildren().addAll(label1, tfNum1, label2, tfNum2, label3, tfTotal);
      hPane2.getChildren().addAll(add, subtract, multiply, divide);
      
      Scene scene = new Scene(pane, 400, 70);
      primaryStage.setTitle("Simple Calculator");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}