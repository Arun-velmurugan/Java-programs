import java.util.Scanner;
class BankSystem
{
	int balance = 0;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
	    System.out.println("************BANKING SYSTEM************");
		BankSystem b = new BankSystem();
		b.menu();
	}
	void menu()
	{
		boolean exit = true;
		//int initWithdrawAmt;
		//int initDepositAmt;
		do
		{
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAW");
			System.out.println("3.CHECKBALANCE");
			System.out.println("4.EXIT");
			System.out.print("CHOOSE THE OPTION: ");
			int option = sc.nextInt();
			if(option ==1)
			{
				deposit();
			}
			else if(option==2)
			{
				withdraw();
			}
			else if(option==3)
			{
				int finalBal = checkBal();
				System.out.println(finalBal);
			}
			else
			{
				exit = false;
			}
		}while(exit);
	}
	
	void deposit()
	{
		System.out.print("ENTER YOUR DEPOSIT AMOUNT: ");
		int depositAmt = sc.nextInt();
		balance = balance + depositAmt;
		System.out.println("YOUR AVAILABLE ACCOUNT BALANCE IS: "+balance);
	}
	
	void withdraw()
	{
		System.out.print("ENTER YOUR WITHDRAW AMOUNT: ");
		int withdrawAmt = sc.nextInt();
		if(withdrawAmt<=balance)
		{
			System.out.println("ALLOW WITHDRAWAL");
			balance = balance - withdrawAmt;
		}
		else
		{
			System.out.println("-----INSUFFICIENT BALANCE-----");
		}
	}
	
	int  checkBal()
	{
		return balance;
	}
}