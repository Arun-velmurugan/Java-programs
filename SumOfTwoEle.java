import java.util.Scanner;
class SumOfTwoEle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the "+i+" Value is: ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<=1;i++)
		{
		    sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}