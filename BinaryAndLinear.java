import java.util.Scanner;
class BinaryAndLinear
{
	Scanner se = new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SIZE OF AN ARRAY: ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		//System.out.print("ENTER THE TARGET VALUE: ");
		//int target = sc.nextInt();
		BinaryAndLinear bl = new BinaryAndLinear();
		bl.menu(ar);
		
	}
	void menu(int arr[])
	{
		boolean exit = true;
		do
		{
			System.out.println("1.INSERT ELEMENTS");
			System.out.println("2.DISPLAY ELEMENTS");
			System.out.println("3.LINEAR SEARCH");
			System.out.println("4.BINARY SEARCH");
			System.out.println("5.EXIT");
			System.out.print("ENTER THE OPTION: ");
			int option = se.nextInt();
			if(option==1)
			{
				insert(arr);
			}
			else if(option==2)
			{
				display(arr);
			}
			else if(option==3)
			{
				int targetIndex = searchLinear(arr);
				System.out.println(targetIndex);
			}
			else if(option==4)
			{
				int targetInd = searchBinary(arr);
				System.out.println(targetInd);
			}
			else
			{
				exit = false;
			}
		}while(exit);
	}
	
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+" IS: ");
			arr[i] = se.nextInt();
		}
	}
	
	void display(int darr[])
	{
		for(int i=0;i<darr.length;i++)
		{
			System.out.print(darr[i]+" ");
		}
	}
	
	int searchLinear(int arr[])
	{
		System.out.print("ENTER THE TARGET VALUE: ");
		int target = se.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	
	int searchBinary(int arr[])
	{
		System.out.print("ENTER THE TARGET VALUE: ");
		int target = se.nextInt();
		int left = 0;
		int right = arr.length-1;
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid]>target)
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return -1;
	}
	
}