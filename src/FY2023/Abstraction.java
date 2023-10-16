package FY2023;

abstract class Dem1
{
	abstract void test();
	abstract void disp();
}
class Sam1 extends Dem1
{
	void test()
	{
		System.out.println("Hii");
	}
	void disp()
	{
		System.out.println("Hello");
	}
}



public class Abstraction {

	public static void main(String[] args)
	{
		Sam1 s= new Sam1();
		s.test();
		s.disp();

	}

}
