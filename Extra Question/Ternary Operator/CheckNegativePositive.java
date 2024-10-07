
import java.util.Scanner;

class CheckNegativePositive
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		
        int ch = sc.nextInt();  
                String result = ch > 1
                        ? "The number is positive." 
                        : ch == 0
                        ? "The number is zero" 
                        : "The number is negative";
		
		System.out.println(result);
	}
}

