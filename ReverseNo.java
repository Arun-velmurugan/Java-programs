import java.util.Scanner;
class ReverseNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER: ");
		int num = sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}