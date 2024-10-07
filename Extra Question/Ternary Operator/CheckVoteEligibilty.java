
class CheckVoteEligibilty
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character : ");
		
		int age = sc.nextInt(); 
        String result = age >=18
                        ? "Eligible to vote" 
                        : "Not eligible to vote.";
		
		System.out.println(result);
	}
}

