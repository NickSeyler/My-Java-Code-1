//Author:      Nick Seyler
//Date:        November 17, 2015
//Description: An investment-value calculator.
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class FXInvestment extends Application
{
   public void start(Stage primaryStage)
   {
      GridPane pane = new GridPane();
      pane.setPadding(new Insets(5, 5, 5, 5));
      
      TextField investmentAmount = new TextField();
      TextField numberOfYears = new TextField();
      TextField annualInterestRate = new TextField();
      TextField futureValue = new TextField();
      Button calculate = new Button("Calculate");
      
      pane.add(new Label("Investment Amount:"), 0, 0);
      pane.add(investmentAmount, 1, 0);
      pane.add(new Label("Number of Years:"), 0, 1);
      pane.add(numberOfYears, 1, 1);
      pane.add(new Label("Annual Interest Rate:"), 0, 2);
      pane.add(annualInterestRate, 1, 2);
      pane.add(new Label("Future Value:"), 0, 3);
      pane.add(futureValue, 1, 3);
      pane.add(calculate, 1, 4);
      
      investmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
      numberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
      annualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
      futureValue.setAlignment(Pos.BOTTOM_RIGHT);
      futureValue.setEditable(false);
      pane.setHalignment(calculate, HPos.RIGHT);
      
      calculate.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent e)
         {
            double invAmt = Double.parseDouble(investmentAmount.getText());
            double monthlyRate = Double.parseDouble(annualInterestRate.getText()) / 1200;
            double years = Integer.parseInt(numberOfYears.getText());
            double futVal = invAmt * Math.pow(1 + monthlyRate , years * 12);
            futureValue.setText(String.format("$%.2f", futVal));
            
         }
      });
  
      Scene scene = new Scene(pane);
      primaryStage.setTitle("Investment-Value Calculator");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   public static void main(String [] args)
   {
      Application.launch(args);
   }
}