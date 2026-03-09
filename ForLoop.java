import java.util.Scanner;
class ForLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for (int i=num;num<=10;num++)
		{
			System.out.println(num);
		}
	}
}