package bankingApp;
import java.util.Scanner;
import static java.lang.System.out; 


public class BankingApplication {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("John Doe", "BA000"); 
		acc1.showMenu();
		
	}

}

class BankAccount 
{
	double balance;
	double previousTransaction;
	String customerName;
	String customerID; 
	
	BankAccount(String cname, String cid)   // constructor takes name of the class
	{
		customerName = cname;
		customerID = cid; 
	}
	
	void deposit(double amount) 
	{
		if (amount != 0) 
		{
			balance = balance + amount; 
			previousTransaction = amount; 
		}
		
	}
	
	void withdraw(double amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount; 
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			out.println("Deposited: "+ previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			out.println("withdrawn: " + Math.abs(previousTransaction)); 
		}
		else
		{
			out.println("No Transaction occured"); 
		}
	}
	
	void showMenu()
	{
		char option='\0'; 
		Scanner scanner = new Scanner(System.in);
		
		out.println("Welcome " + customerName); 
		out.println("Your ID is " + customerID);
		out.println("A. Check Balance");
		out.println("B. Deposit"); 
		out.println("C. Withdraw"); 
		out.println("D. Previous Transaction"); 
		out.println("E. Exit"); 
		
		do
		{
			out.println("==========================================================================================");
			out.println("Enter an option"); 
			out.println("==========================================================================================");
			option = scanner.next().charAt(0); 
			out.println("\n"); 
			
			switch(option)
			{
			case 'A':
				out.println("------------------------------------");
				out.println("Balance = " + balance);
				out.println("------------------------------------");
				out.println("\n");
				break; 
				
			case 'B':
				out.println("------------------------------------");
				out.println("Enter an amount to deposit: ");
				out.println("------------------------------------");
			    double amount = scanner.nextDouble(); 
			    deposit(amount); 
				out.println("\n");
				break; 
				
			case 'C':
				out.println("------------------------------------");
				out.println("Enter an amount to withdraw: ");
				out.println("------------------------------------");
				double amount2 = scanner.nextDouble(); 
				withdraw(amount2); 
				out.println("\n");
				break; 
				
			case 'D':
				out.println("------------------------------------");
				getPreviousTransaction(); 
				out.println("------------------------------------");
				out.println("\n");
				break; 
			
			case 'E':
				out.println("***********************************");
				break; 
				
			default:
				out.println("Invalid Option!!. Please enter again"); 
				break; 
				
			}
			
		} while(option != 'E'); 
		
		out.println("Thank you for using our services"); 
		
	}
}















