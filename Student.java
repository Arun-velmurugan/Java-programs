import java.util.Scanner;
class Student
{
	String name;
	int rollNo;
	int marks;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.name = sc.nextLine();
		s1.rollNo = sc.nextInt();
		s1.marks = sc.nextInt();
		
		System.out.print(s1.name+" ");
		System.out.print(s1.rollNo+" ");
		System.out.print(s1.marks);
	}
}