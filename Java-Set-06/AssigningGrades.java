//Author:      Nick Seyler
//Date:        Apr 2, 2015
//Description: Reads scores, gets the best score, and assigns grades.

import java.util.Scanner;

public class AssigningGrades
{
   public static void main(String [] args)
   {
      int[] grades = readScore();
      int max = bestScore(grades);
      curveScore(grades, max);
      
   }
   
   //get the score of students from input
   public static int[] readScore()
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of students: ");
      int students = input.nextInt();
      
      int[] grades = new int[students];
      System.out.print("Enter " + students + " scores: ");
      for (int i = 0; i < students; i++)
      {
         grades[i] = input.nextInt();
      }
      input.close();
      
      return grades;
   }
   
   //find the best score of all scores
   public static int bestScore(int [] grades)
   {
      int max = 0;
      for(int i=0; i < grades.length; i++)
      {
         if(grades[i] > max)
            max = grades[i];
      }
      return max;
   }
   
   //curve the score based on the best score
   public static void curveScore(int [] grades, int best)
   {
      char letterGrade;
      for(int i=0; i < grades.length; i++)
      {
         if (grades[i] >= best - 10)
            letterGrade = 'A';
         else if (grades[i] >= best - 20)
            letterGrade = 'B';
         else if (grades[i] >= best - 30)
            letterGrade = 'C';
         else if (grades[i] >= best - 40)
            letterGrade = 'D';
         else
            letterGrade = 'F';
         
         String s = "Student " + (i + 1) + " score is " + grades[i] + " and grade is " + letterGrade;   
         printOutput(s);
      }
      
      
   }
   
   //display the students, their score, and their grades
   public static void printOutput(String s)
   {
      System.out.println(s);
   }
}
