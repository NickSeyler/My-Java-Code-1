//Author:      Nick Seyler
//Date:        Sept 16, 2015
//Description: Calculates two numbers; does not use an exception handler but handles non-numeric inputs

public class CalculatorWithoutExceptionHandler
{
   public static void main(String [] args)
   {
      if (args.length != 3)
      {
         System.out.println("Usage: java Calculator operand1 operator operand2");
         System.exit(0);
      }
      
      int result = 0;
      boolean goToElse = false;
      String operand1 = args[0];    
      String operand2 = args[2];
      
      //This do-while statement allows for checking for errors of non-numeric inputs without a NumberFormatException error.
      do 
      {
         if(!goToElse)
         {
            for (int i = 0; i < operand1.length(); i++)
            {
               if (!Character.isDigit(operand1.charAt(i)))
               {
                  System.out.println("Wrong Input: " + args[0]);
                  System.exit(0);
               }
         
            }  
      
            for (int i = 0; i < operand2.length(); i++)
            {
               if (!Character.isDigit(operand2.charAt(i)))
               {
                  System.out.println("Wrong Input: " + args[2]);
                  System.exit(0);
               }
            }
            
            goToElse = true;  
         
         }
         
         else
         {
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
            
            goToElse = false;
         }
      
      } while (goToElse);      
   }
}