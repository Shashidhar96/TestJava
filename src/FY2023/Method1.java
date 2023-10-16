package FY2023;

public class Method1 {

		// Non Static Method
		
		public static void add()
		{
			int a=10,b=20;
			int c=a+b;
			System.out.println("The addition of the 2 number is: "+ c);
		}
		
		static void sub()
		{
			int a=80,b=30;
			int c=a-b;
			System.out.println("The subtraction of the 2 number is: "+c);
		}
		static void mul()
		{
			int a=7,b=7;
			int c=a*b;
			System.out.println("The multiplication of the 2 number is: "+c);
		}
		static void div()
		{
			int a=25,b=5;
			int c=a/b;
			System.out.println("The division of the 2 number is: "+c);
		}
		static void sqr()
		{
			int a=8;
			int b=a*a;
			System.out.println("The square of the number is: "+b);
		}
		static void cub()
		{
			int a=3;
			int b=a*a*a;
			System.out.println("The cube  of the number is: "+b);
		}
		static void mod()
		{
			int a=16%3;
			int b=a;
			System.out.println("The modulus of the number is: "+b);
		}
		public static void main(String[] args) {
			
			Method1 m1=new Method1();
			m1.add();
			
			Method1 m2=new Method1();
			m2.sub();
			
			Method1 m3=new Method1();
			m3.mul();
			
			Method1 m4=new Method1();
			m4.div();
			
			Method1 m5=new Method1();
			m5.sqr();
			
			Method1 m6=new Method1();
			m6.cub();
			
			Method1 m7=new Method1();
			m7.mod();
		}

}
