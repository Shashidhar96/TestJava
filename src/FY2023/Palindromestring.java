package FY2023;

public class Palindromestring {

	public static void main(String[] args) 
	{
		String s1="Momo";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}
	}
}
