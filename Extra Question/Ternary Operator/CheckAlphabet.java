import java.util.Scanner;

class CheckAlphabet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character : ");
		
		char ch = sc.next().charAt(0); 
        String result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
                        ? "The character is an alphabet." 
                        : "The character is not an alphabet.";
		
		System.out.println(result);
	}
}
