import java.util.Scanner;
class Exam
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting No: ");
		int firstNum = sc.nextInt();
		int temp = firstNum;
		int lastDigit = 0;
		System.out.print("Enter the Ending No: ");
		int lastNum = sc.nextInt();
		int evenNo = 0;
		int oddNo = 0;
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		int oddSum = 0;
		for(int i=firstNum;i<=lastNum;i++)
		{
		    if(i%2==0)
		        { 
			       evenNo = i;
		           System.out.println("Even no: "+evenNo); 
				   evenCount++;
				   evenSum = i+evenSum;				
				}
		}
		System.out.println("Even num Count: "+evenCount);
		System.out.println("Even num Sum: "+evenSum);
		for(int i=firstNum;i<=lastNum;i++)
		{
		    if(i%2==1)
		        { 
			       oddNo = i;
		           System.out.println("Odd no: "+oddNo); 
				   oddCount++;
				   oddSum = i+oddSum;
				}
		}		
		System.out.println("Odd num Count: "+oddCount);
		System.out.println("Odd num Sum: "+oddSum);
	}
}