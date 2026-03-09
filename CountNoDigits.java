import java.util.Scanner;
class CountNoDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int num = sc.nextInt();
		int count = 0;
		if(num==0)
		{
			count++;
		}
		else
		{
		    while(num!=0)
			{
			num=num/10;
			count++;
			}
		}
		System.out.println(count);
	}
}