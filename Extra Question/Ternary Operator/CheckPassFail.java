import java.util.Scanner;

class CheckPassFail
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
    
		System.out.println("Enter marks : ");
		
		int marks = sc.nextInt();
		String result = marks >= 33 
      ? "Pas" 
      : "Fail";
		
		System.out.println(result);
	}
}
