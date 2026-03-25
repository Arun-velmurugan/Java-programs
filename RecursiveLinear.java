import java.util.Scanner;
class RecursiveLinear
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		int target = 30;
		int index = 0;
		
		RecursiveLinear rl = new RecursiveLinear();
		int targetIndex = rl.search(arr,target,index);
		System.out.println(targetIndex);
	}
	
	int search(int arr[],int target,int index)
	{
		if(index>=arr.length)
		{
			return -1;
		}
		if(arr[index]==target)
		{
			return index;
		}
		return search(arr,target,index+1);
	}
}