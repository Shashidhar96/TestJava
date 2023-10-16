package FY2023;

public class Revnumber {

	public static void main(String[] args) 
	{
		int num=127;
		int rev=0;
		while(num!=0) //127!=0, 12!=0,  1!=1, 0!=0
		{
			int rem=num%10;//127%10=7, 12%10=2, 1%10=1
			rev=rev*10+rem;
			
			num=num/10; // 127/10=12, 12/10=1, 1/10=0
		}
		System.out.println(rev);

	}

}
