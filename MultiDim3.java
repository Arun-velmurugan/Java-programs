class MultiDim3
{
	public static void main(String[] args)
	{
		char arr[][] = {{'V','I','J','A','Y'},{'A','J','I','T','H'},{'K','A','M','A','L'},{'S','I','M','B','U'}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}