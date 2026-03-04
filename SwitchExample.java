import java.util.Scanner;
class SwitchEx
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the respective Weakday");
		System.out.print("Enter your fav day : ");
		String day = sc.nextLine();
		switch (day)
		{
			case "Monday":
			{
				System.out.println("Monday");
				break;
			}
			case "Tuesday":
			{
				System.out.println("Tuesday");
				break;
			}
			case "Wednesday":
			{
				System.out.println("Wednesday");
				break;
			}
			case "Thursday":
				{
					System.out.println("Thursday");
					break;
				}
			case "Friday":
				{
					System.out.println("Friday");
					break;
				}
			case "Saturday":
				{
					System.out.println("Saturday");
					break;
				}
		    default:
				{
					System.out.println("Sunday");
				}

		}
	}
}
