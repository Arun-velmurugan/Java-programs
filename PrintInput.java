import java.util.Scanner;
class PrintInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SIZE: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int print = 0;
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print("ENTER THE INPUT: ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}