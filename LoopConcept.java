import java.util.Scanner;
class LoopConcept
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num = sc.nextInt();
		int temp = 0;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}