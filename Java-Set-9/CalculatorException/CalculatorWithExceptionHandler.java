//Author:      Nick Seyler
//Date:        Sept 16, 2015
//Description: Calculates two numbers; contains an exception handler for a non-numeric input

public class CalculatorWithExceptionHandler
{
   public static void main(String [] args)
   {
      if (args.length != 3)
      {
         System.out.println("Usage: java Calculator operand1 operator operand2");
         System.exit(0);
      }
      
      int result = 0;
      
      try
      {
         Integer.parseInt(args[0]);
      }
      catch(NumberFormatException ex)
      {
         System.out.println("Wrong Input: " + args[0]);
         System.exit(0);
      }
      
      try
      {
         Integer.parseInt(args[2]);
      }
      catch(NumberFormatException ex)
      {
         System.out.println("Wrong Input: " + args[2]);
         System.exit(0);
      }
      
      
      switch(args[1].charAt(0))
      {
         case '+': result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                break;
         case '-': result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                break;    
         case '.': result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                break;               
         case '/': result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
                break;   
      }   
      System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
   }
}
