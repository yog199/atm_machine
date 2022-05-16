import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int balance = 5000, withdraw, deposit;

      HashMap < Integer, Integer > hm = new HashMap <> ();
      hm.put (1234, 123);
      hm.put (5678, 456);
      hm.put (90101112, 789);
      hm.put (13141516, 001);
      System.out.println ("Welcome to SBI ATM");
      System.out.print ("Enter your Account Number: ");
    int acc = sc.nextInt ();
      System.out.print ("Enter your pin: ");
    int pin = sc.nextInt ();
    if (hm.containsKey (acc) && hm.get (acc) == pin)
      {
	while (true)
	  {

	    System.out.println ("Choose 1 for Withdraw");
	    System.out.println ("Choose 2 for Deposit");
	    System.out.println ("Choose 3 for Check Balance");
	    System.out.println ("Choose 4 for EXIT");
	    System.out.print ("Choose option:");

	    int choice = sc.nextInt ();
	    switch (choice)
	      {
	      case 1:
		{
		  System.out.print ("Enter money to be withdrawn:");

		  withdraw = sc.nextInt ();

		  if (balance >= withdraw)
		    {
		      balance = balance - withdraw;
		      System.out.println ("Please collect your money");
		    }
		  else
		    {
		      System.out.println ("Insufficient Balance");
		    }
		  System.out.println ("");
		  break;
		}

	      case 2:
		{

		  System.out.print ("Enter money to be deposited:");
		}

		deposit = sc.nextInt ();

		balance = balance + deposit;
		System.out.
		  println ("Your Money has been successfully depsited");
		System.out.println ("");
		break;

	      case 3:
		{
		  System.out.println ("Balance : " + balance);
		  System.out.println ("");
		  break;
		}

	      case 4:
		{
		  System.out.println ("Than you for using SBI ATM.");
		  System.out.println ("");
		  System.exit (0);
		}
	      }
	  }
      }
    else
      {
	System.out.
	  println ("Invalid pin or Account number. Please try again.");
      }
  }
}

