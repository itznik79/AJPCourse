import java.util.Scanner;

class CheckleapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year : ");
		
		int year = sc.nextInt();
		String result = (year%4==0 && year%100!=0) || year%400 ==0 
      ? "Leap Year" 
      : "Not Leap year";
    
		System.out.println(result);
	}
}
