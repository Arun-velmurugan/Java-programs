import java.util.Scanner;
class CountDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER: ");
		int num = sc.nextInt();
		int count = 0;
		int rev = 0;
		if(num==0)
		{
			count++;
		}
		for(;num!=0;num=num/10)
		{
			count++;
		}
		System.out.println(count);
	}
}