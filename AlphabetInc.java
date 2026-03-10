import java.util.Scanner;
class AlphabetInc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		System.out.print("Enter The Num: ");
		int row = num.nextInt();
		for(int i=1;i<=row;i++)
		{
			char ch = 'A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
