import java.util.Scanner;
class SecondMin
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE ARR SIZE : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int min;
		int secondMin;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+" IS ");
			arr[i]=sc.nextInt();
		}
		if(arr[0]<arr[1])
		{
			min = arr[0];
			secondMin = arr[1];
		}
		else
		{
			min = arr[1];
			secondMin = arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i]<secondMin && arr[i]!=min)
			{
				secondMin = arr[i];
			}
		}
		System.out.println(secondMin);
	}
}