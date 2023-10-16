package FY2023;

public class Consrt2 {
	int x;
	double y;
	Consrt2 (int a,double b)
	{
		x=a;
		y=b;
		return;
	}

	public static void main(String[] args) {
		
		Consrt2 c=new Consrt2(10,5.5);
		System.out.println(c.x);
		System.out.println(c.y);
	}

}
