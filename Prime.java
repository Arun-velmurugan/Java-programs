import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER: ");
		int num = sc.nextInt();
		boolean isPrime = true;
		if(num<=1)
		{
			isPrime = false;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println("THE GIVEN NUMBER IS PRIME NUMBER");
		}
		else
		{
			System.out.println("THE GIVEN NUMBER IS NOT A PRIME NUMBER");
		}
	}
}