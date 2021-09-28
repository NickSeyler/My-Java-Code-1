//Author:      Nick Seyler
//Date:        Feb 4, 2015
//Description: Asks the user for his weight and height, then calculates his Body Mass Index

import java.util.Scanner;

public class BMI
{
   public static void main (String [] args)
   {
      run();
   }
   
   public static void run()
   {
      //declare and assign variables
      Scanner input = new Scanner(System.in);
      double weight, feet, inches, weightInKilograms, heightInInches, heightInMeters, bmi;
      //declare and assign constants
      final double KILOGRAMS_PER_POUND = 0.45359273;
      final double METERS_PER_INCH = 0.0254;
      
      //user input
      System.out.print("Enter weight in pounds: ");
      weight = input.nextDouble();
      System.out.print("Enter feet: ");
      feet = input.nextDouble();
      System.out.print("Enter inches: ");
      inches = input.nextDouble();
      input.close();
      
      //compute BMI
      weightInKilograms = weight * KILOGRAMS_PER_POUND;
      heightInInches = feet * 12 + inches;
      heightInMeters = heightInInches * METERS_PER_INCH;
      bmi = weightInKilograms / (heightInMeters * heightInMeters);
      
      //output
      System.out.println("Your BMI is " + bmi);
      
      if (bmi < 18.5)
      {
         System.out.println("Underweight");
      }
      else if (bmi < 25)
      {
         System.out.println("Normal");
      }
      else if (bmi < 30)
      {
         System.out.println("Overweight");
      }
      else
      {
         System.out.println("Obese");
      }
   }
}