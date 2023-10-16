package FY2023;

public class Recurs {
	static int fact=1,no=5;
	static void rec()
	{
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		rec();
	}

}
