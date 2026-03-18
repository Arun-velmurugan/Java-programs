import java.util.Scanner;
class SecondMax
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE ARR SIZE: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max; 
		int secondMax;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+" IS :");
			arr[i] = sc.nextInt();
		}
		if(arr[0]>arr[1])
		{
			max = arr[0];
			secondMax = arr[1];
		}
		else
		{
			max = arr[1];
			secondMax = arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max)
			{
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	}
}