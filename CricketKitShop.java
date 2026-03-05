import java.util.Scanner;
class CricketKitShop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO VIRAT'S CRICKETKIT SHOP");
		System.out.println("1.BAT");
		System.out.println("2.BALL");
		System.out.println("3.PAD");
		System.out.print("CHOOSE YOUR OPTION: ");
		int options = sc.nextInt();
		if(options==1)
		{
			System.out.println("1.MRF");
			System.out.println("2.SPARTONS");
			System.out.println("3.CEAT");
			System.out.print("ENTER YOUR FAV BAT: ");
			int batOpt = sc.nextInt();
			if (batOpt==1)
			{
				System.out.println("MRF BAT PRICE IS RS.5000");
			}
			else if(batOpt==2)
			{
				System.out.println("SPARTONS BAT PRICE IS RS.3500");
			}
			else if(batOpt==3)
			{
				System.out.println("CEAT BAT PRICE IS RS.3000");
			}
			else 
			{
				System.out.println("YOUR FAV BAT IS STOCK OUT PLEASE COME AFTER A WHILE");
			}
		}
		else if(options==2)
		{
			System.out.println("1.STRITCHED");
			System.out.println("2.CORK");
			System.out.println("3.STUMPER");
			System.out.print("ENTER YOUR FAV BALL: ");
			int ballOpt = sc.nextInt();
			if (ballOpt==1)
			{
				System.out.println("STRITCHED BALL PRICE IS RS.250");
			}
			else if(ballOpt==2)
			{
				System.out.println("CORK BALL PRICE IS RS.500");
			}
			else if(ballOpt==3)
			{
				System.out.println("STUMPER BALL PRICE IS RS.40");
			}
			else 
			{
				System.out.println("THER IS NO OPTION EXIST IN BALL SECTION");
			}
			
		}
		else if(options==3)
		{
			System.out.println("1.LEG PAD");
			System.out.println("2.THIGH PAD");
			System.out.println("3.HIP PAD");
			System.out.print("WHICH PAD IS YOU PREFFERED: ");
			int padOpt = sc.nextInt();
			if (padOpt==1)
			{
				System.out.println("LEG PAD PRICE IS RS.2000");
			}
			else if(padOpt==2)
			{
				System.out.println("THIGH PAD PRICE IS RS.1500");
			}
			else if(padOpt==3)
			{
				System.out.println("HIP PAD PRICE IS RS.1500");
			}
			else 
			{
				System.out.println("YOUR PREFFERED PAD IS STOCK OUT PLEASE COME AFTER A WHILE");
			}
		}
		else
		{
			System.out.println("THERE IS NO MORE KITS EXIST");
		}
	}
	
}