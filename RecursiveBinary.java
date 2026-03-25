import java.util.Scanner;
class RecursiveBinary
{
	public static void main(String[] args)
	{
		int arr[] = {5,10,15,20,25,30};
		int target = 20;
		int left = 0;
		int right = arr.length-1;
		RecursiveBinary rb = new RecursiveBinary();
		System.out.println(rb.search(arr,target,left,right));
	}
	
	int search(int arr[],int target,int left,int right)
	{
		if(left>right)
		{
			return -1;
		}
		int mid = (left+right)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		if(arr[mid]<target)
		{
			return search(arr,target,mid+1,right);
		}
		return search(arr,target,left,mid-1);
		
	}
}