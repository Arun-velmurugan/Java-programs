import java.util.Scanner;
class TypeCastSample
{
    Scanner num = new Scanner(System.in);
	Scanner ch = new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUM: ");
		int num = sc.nextInt();
		TypeCastSample t = new TypeCastSample();
		//result = t.widening();
		t.widening1(num);
		t.narrowing1();
	}
	
	void widening1(int num)
	{
		double deciNum = num;
		System.out.println(deciNum);
		System.out.println(widening2());	
	}
	
	int widening2()
	{
		System.out.print("ENTER YOUR CHAR: ");
		char initial = ch.next().charAt(0);
		int asciiCode = initial;
		return asciiCode;
	}
	
	void narrowing1()
	{
		System.out.print("ENTER THE DIGIT: ");
		double weight = num.nextDouble();
		System.out.println((int)weight);
		System.out.println(narrowing2());
	}

	byte narrowing2()
	{
		System.out.print("ENTER THE NUM: ");
		int num1 = num.nextInt();
		return (byte)num1;
	}
	
	
}