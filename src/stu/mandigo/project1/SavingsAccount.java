//FILE: SavingsAccount.java
//PROG: Alex Mandigo
//PURP: Simulate a simple bank savings account that allows deposits and withdrawals
package stu.mandigo.project1;

public class SavingsAccount 
   {
	private String accountNumber;

	private double balance;

	private double rate;
	
	public SavingsAccount()
	{
	   balance = 0.0;
	   accountNumber = "";
	   rate = 0.0;
	}
	
	public String getAccountNumber()
	{
	   return accountNumber;
	}
	
	public void setAccountNumber(String newAcctNum)
	{
	   accountNumber = newAcctNum;
	}

	public double getBalance()
	{
	return balance;
	}

	public void addToBalance(double amount)
	{
	balance += amount;
	}
	
	public void subtractFromBalance(double amount)
	{	
	balance -= amount;
	}
	
	public double getRate()
	{
	return rate;
	}
	
	public void setRate(double newIntRate)
	{
	rate = newIntRate;
	}
	
	
	
   }//END class SavingsAccount
