import java.util.Scanner;
class SmartCityUtility
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		System.out.println("SMART CITY UTILITY MENU");
        System.out.println("1.Electricity Bill");
		System.out.println("2.Water Bill");	
		System.out.println("3.Internet Plan");
		System.out.println("4.Exit");
		System.out.print("Enter your choice: ");
		int monthlyExpense = num.nextInt();
		if(monthlyExpense==1)
		{
			System.out.print("Enter your CURRENT UNITS: ");
			int units = num.nextInt();
			if(units<=100)
			{
			System.out.println("RS:2 PER UNIT");
			}
			else if(units>100 && units<=300)
			{
				System.out.println("RS:3 PER UNIT");
			}
			else 
			{
				System.out.println("RS:5 PER UNIT");
			}
		}
		else if(monthlyExpense==2)
		{
			System.out.print("ENTER YOUR HOUSE TYPE: ");
			int houseType = num.nextInt();
			if(houseType==1)
			{
				System.out.println("MONTHLY CHARGE = R:300");
			}
			else if(houseType==2)
			{
				System.out.println("MONTHLY CHARGE = RS:500");
			}
			else
			{
				System.out.println("MONTHLY CHARGE = RS:1000");
			}
		}
		else if(monthlyExpense==3)
		{
			System.out.print("Enter Plan Choice: ");
			String internetPlan = sc.nextLine();
			if(internetPlan=="Basic Plan")
			{
			    System.out.println("BASIC PLAN - RS:399");
			}
			else if(internetPlan=="Standard Plan")
			{
				System.out.println("BASIC PLAN - RS:699");
			}
			else
			{
				System.out.println("PREMIUM PLAN - RS:999");
			}
		}
		else if(monthlyExpense==4)
		{
			System.out.println("Thank you for using SMART CITY UTILITY SYSTEM");
		}
		else
		{
			System.out.println("NO MORE BILL");
		}
		}
}
