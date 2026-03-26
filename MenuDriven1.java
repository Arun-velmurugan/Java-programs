import java.util.Scanner;
class MenuDriven1
{
	Scanner se = new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SIZE OF AN ARR: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+i+" IS: ");
			arr[i] = sc.nextInt();
	    }
		int originalArr[] = new int[arr.length];
		
		for(int i=0;i<originalArr.length;i++)
		{
			originalArr[i] = arr[i];
		}
		MenuDriven1 md = new MenuDriven1();
		md.menu(arr,originalArr);
		
	}
	
	void menu(int arr[],int ogAr[])
	{
		boolean exit = true;
		do
		{
			System.out.println("1.BUBBLE SORT");
			System.out.println("2.LARGEST ELEMENT");
			System.out.println("3.DISPLAY ORIGINAL ARRAY");
			System.out.println("4.EXIT");
			System.out.print("ENTER THE OPTION: ");
			int option = se.nextInt();
			if(option==1)
			{
				bubbleSort(arr);
			}
			else if(option==2)
			{
				findLargest(arr);
			}
			else if(option==3)
			{
				display(ogAr);
			}
			else if(option==4)
			{
				displayUpdatedArr(arr);
            }
			else
			{
				exit = false;
			}
		}while(exit);
		
	}
	
	
	void bubbleSort(int ar[])
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]= temp;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
	void findLargest(int ar[])
	{
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max = ar[i];
			}
		}
		System.out.println(max);
	}
	
	void display(int ogArr[])
	{
		for(int i=0;i<ogArr.length;i++)
		{
			System.out.print(ogArr[i]+" ");
		}
	}
	
	void displayUpdatedArr(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
}