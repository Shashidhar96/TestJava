package FY2023;

public class swap2num {

	public static void main(String[] args) {
		
		//2 Number using 3rd variable
		
		int a=10;
		int b=20;
		int temp=a; //temp=10
		a=b;        //a=20
		b=temp;     //b=10
		
		System.out.println("a with using 3rd variable --->"+a);
		System.out.println("b with using 3rd variable--->"+b);
		
		//2 Number without using 3rd variable
	
		a=a+b;   //a=30
		b=a-b;   //b=10
		a=a-b;   //a=20
		
		System.out.println("a without using 3rd variable--->"+a);
		System.out.println("b without using 3rd variable--->"+b);
		}

}
