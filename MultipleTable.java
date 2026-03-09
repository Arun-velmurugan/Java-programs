import java.util.Scanner;
class MultipleTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num = sc.nextInt();
		int count = 1;
		do
		{
			int multiple5 = count*num;
			System.out.println(multiple5);
			count++;
		}while(count!=11);
		
	}
}
