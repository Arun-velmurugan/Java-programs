import java.util.Scanner;
class App
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		App a = new App();
		a.menu();
	}
	void menu()
	{
		boolean result = true;
		System.out.print("ENTER THE STARTING NO: ");
		int startNo = sc.nextInt();
		System.out.print("ENTER THE ENDING NO: ");
		int endNo = sc.nextInt();
		do
		{
			System.out.println("1.EVEN NO");
			System.out.println("2.REVERSE NO");
			System.out.println("3.DIVISIBLE BY 5");
			System.out.println("4.SUM OF ALL NUMBERS");
			System.out.println("5.Count of Numbers");
			System.out.print("ENTER THE OPTION: ");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
				{
					evenNo(startNo,endNo);
					break;
				}
				case 2:
				{
					reverseNo(startNo,endNo);
					break;
				}
				case 3:
				{
					div5(startNo,endNo);
					break;
				}
				case 4:
				{
					sum(startNo,endNo);
					break;
				}
				case 5:
				{
					int len = count(startNo,endNo);
					System.out.println(len);
					break;
				}
				default:
				{
					result = false;
				}
			}
		}while(result);
		
	}
	
	void evenNo(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	void reverseNo(int a, int b)
	{
		for(int i=b;i>=a;i--)
		{
			System.out.println(i);
		}
	}
	
	void div5(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
	
	void sum(int a,int b)
	{
		int sum = 0;
		for(int i=a;i<=b;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	int count(int a, int b)
	{
		int count = 0;
		for(int i=a;i<=b;i++)
		{
			count++;
		}
		return count;
	}
}