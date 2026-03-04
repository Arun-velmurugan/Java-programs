import java.util.Scanner;
class BioData
{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your last name: ");
		char initial = sc.next().charAt(0);
		System.out.print("Enter your age: ");
		int age = num.nextInt();
		System.out.print("Phone no: ");
		long ph_no = num.nextLong();
		System.out.println("My name is "+name);
		System.out.println("My initial is "+initial);
		System.out.println("My age is "+age);
		System.out.println("My Phone Number is "+ph_no);
	}
}