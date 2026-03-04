import java.util.Scanner;
class Color
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the color: ");
		String favColor = sc.nextLine();
		
		switch(favColor)
		{
			case "Red":
			{
				System.out.println("Red means Danger");
				break;
			}
			case "Green":
			{
				System.out.println("Green means Nature");
				break;
			}
			case "Blue":
			{
				System.out.println("Blue means Sky");
				break;
			}
		}
	}
}