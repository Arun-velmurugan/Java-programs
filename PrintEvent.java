import java.util.Scanner;
class PrintEvent
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}