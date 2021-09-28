//Author:      Nick Seyler
//Date:        Apr 28, 2015
//Description: Simulates an account

import java.util.Date;

public class Account
{
   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated = new Date();
   
   Account()
   {
      id = 0;
      balance = 0;
      annualInterestRate = 0;
   }
   
   Account(int newID, double newBalance)
   {
      id = newID;
      balance = newBalance;
      annualInterestRate = 0;
   }
   
   public int getID()
   {
      return id;
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public double getAnnualInterestRate()
   {
      return annualInterestRate;
   }
   
   public void setID(int newID)
   {
      id = newID;
   }
   
   public void setBalance(double newBalance)
   {
      balance = newBalance;
   }
   
   public void setAnnualInterestRate(double newAnnualInterestRate)
   {
      annualInterestRate = newAnnualInterestRate;
   }
   
   public Date getDate()
   {
      return dateCreated;
   }
   
   public double getMonthlyInterestRate()
   {
      return annualInterestRate / 12;
   }
   
   public double getMonthlyInterest()
   {
      return balance * annualInterestRate / 12 / 100;
   }
   
   public void withdraw(double money)
   {
      balance = balance - money;
   }
   
   public void deposit(double money)
   {
      balance = balance + money;
   }
   
   public String toString()
   {
      return "Account ID:\t\t" +  id + "\n" +
      "Account Balance:\t$" + balance + "\n" +
      "Annual Interest Rate:\t%" + annualInterestRate + "\n" +
      "Date Opened:\t\t" + dateCreated;
   }
}