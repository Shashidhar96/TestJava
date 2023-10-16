package FY2023;

class Sam
{
	int x = 10;
}
class Tester extends Sam
{
	void disp()
	{
		System.out.println("Hii");
	}
}
class Dem extends Sam
{
	void test()
	{
		System.out.println("Welcome to INDIA");
	}
}



public class Hierarchical
{

	public static void main(String[] args) 
	{
		Tester t = new Tester();
		System.out.println(t.x);
		t.disp();
		
		Dem d = new Dem();
		System.out.println(d.x);
		d.test();
	}

}
