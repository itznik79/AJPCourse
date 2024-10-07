import java.util.Scanner;

class ConvertIntoLowercase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character : ");
		
        char ch = sc.next().charAt(0);
        char result = (ch >= 'A' && ch <= 'Z') 
                        ? (char)(ch + 32) 
                        : ch;
                        
		
		System.out.println("The converted character is: " + result);
	}
}
