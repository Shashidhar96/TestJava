package FY2023;

public class Method2 {
	//circle
	void area(int r)
	{
		final double pi=3.147;
		double result=pi*r*r;
		System.out.println(result);
	}
	//Triangle
	void area(int b,int h)
	{
		double result= (1/2.0)*b*h;
		System.out.println(result);
	}
	//Rectangle
	void area1(int w,int h)
	{
		double result= w*h;
		System.out.println(result);
	}
	//Square
		void area2(int a)
		{
			double result= a*a;
			System.out.println(result);
		}

	public static void main(String[] args) {
		
		Method2 c1=new Method2();
		c1.area(5);
		
		Method2 t1=new Method2();
		t1.area(2,4);
		
		Method2 r1=new Method2();
		r1.area1(8, 4);
		
		Method2 s1=new Method2();
		s1.area2(6);

	}

}
