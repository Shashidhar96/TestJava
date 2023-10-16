package FY2023;

public class Fibonaciseries {

	public static void main(String[] args) 
	{
		int fib=6;
		int a=0;
		int b=1;
		
		int count=1;
		while (count<=fib)
		{
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
			count++;
		}
	}
}
