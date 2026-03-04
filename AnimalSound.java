import java.util.Scanner;
class AnimalSound
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Animal Name: ");
		String animal = sc.nextLine();
		switch(animal)
		{
			case "Dog":
			{
				System.out.println("Dog says Lol....");
				break;
			}
			case "Cat":
			{
				System.out.println("Cat says Meow");
				break;
			}
			case "Cow":
			{
				System.out.println("Cow says Moa...");
				break;
			}
		}
	}
	
}