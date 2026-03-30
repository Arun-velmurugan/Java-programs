import java.util.Scanner;
class Account 
{
	float initialBalance;
	int deposit;
	int withdraw;
	float balance;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.print("THE INITIAL BALANCE IS: ");
		a1.initialBalance = sc.nextFloat();
		System.out.print("THE DEPOSIT AMOUNT IS: ");
		a1.deposit = sc.nextInt();
		System.out.print("THE WITHDRAW AMOUNT IS: ");
		a1.withdraw = sc.nextInt();
		a1.deposit1(a1.initialBalance,a1.deposit);
		System.out.print("MY UPDATED BANK BALANCE IS: ");
		System.out.println(a1.finalBal(a1.withdraw));
	}
	
    void deposit1(float initialBal,int dep)
	{
		balance = initialBal + dep;
		//return balance;
	}
	
	float finalBal(int withdraw)
	{
		//deposit1(deposit);
		balance = balance - withdraw;
		return balance;
	}
}