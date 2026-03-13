import java.util.Scanner;
class MultiDim1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		System.out.print("ENTER THE ROW SIZE: ");
		int row = sc.nextInt();
		System.out.print("ENTER THE COL SIZE: ");
		int col = sc.nextInt();
		String arr[][] = new String[row][col];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("ENTER THE "+i+" "+j+" CITY NAME: ");
				arr[i][j]= name.nextLine();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"    ");
			}
			System.out.println();
		}
	}
}