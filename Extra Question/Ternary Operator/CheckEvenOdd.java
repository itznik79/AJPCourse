import java.util.Scanner;

class CheckEvenOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int number = sc.nextInt();
		String result = number%2 == 0 ? "The number is  Even." : "The number is Odd.";
        
		System.out.println(result);
	}
}
