class CheckVowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter letter : ");
		
		char ch = sc.next().charAt(0);
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U 
          ? "The character is a vowel." 
          : "The character is not a vowel.";
        
		System.out.println(result);
	}
}
