//FILE: MainClass.java
//PROG: Alex Mandigo
//PURP: Simulate a real bank savings account using the class SavingsAccount
package stu.mandigo.project1;

import java.util.Scanner;

public class MainClass 
 {
	public static void main(String[] args) 
	 {
		SavingsAccount myAccount = new SavingsAccount();
		
		String name = "";
		
		double currentBalance = myAccount.getBalance();
		
		Scanner inputDevice = new Scanner (System.in);
		
		System.out.println("Please enter your first name, then hit Enter: ");
		
		name = inputDevice.nextLine();
		
		System.out.println("Hello, " + name + "! Thank you for choosing to bank with us. ");
		
		myAccount.setAccountNumber("00148506");
		
		myAccount.setRate(.005);
		
		System.out.println("Your account number is " + myAccount.getAccountNumber() + ".");
		
		System.out.println("The initial balance in your account is $" + currentBalance);
		
		System.out.println("Your interest rate is currently set at " + myAccount.getRate());
		
		System.out.println("How much are you looking to deposit with us? Please type a number, then hit Enter: ");
        
		//Here is where the cash is deposited
		myAccount.addToBalance(inputDevice.nextDouble());
		
		System.out.println("The new balance after deposit is $" + myAccount.getBalance());
		
		System.out.println("Would you like to withdraw any funds? If not, type 0, then hit Enter.");
		
		//Here is where the cash may be subtracted from
		myAccount.subtractFromBalance(inputDevice.nextDouble());

		System.out.println("The new balance after withdrawl is $" + myAccount.getBalance());

		System.out.println("Thank you, " + name + ". Have a wonderful day!");
		
        inputDevice.close();
				
	 }

	

 }//END MainClass
