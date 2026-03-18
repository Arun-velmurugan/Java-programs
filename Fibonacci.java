import java.util.Scanner;
class Fibonacci
{
	void fib(int n)
	{
		int a=0; int b=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fibonacci f1 = new Fibonacci();
		f1.fib(num);
	}
}
