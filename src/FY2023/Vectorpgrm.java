package FY2023;

import java.util.Vector;

public class Vectorpgrm {

	public static void main(String[] args) {
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20.56);
		l1.add(10);
		l1.add(true);
		l1.add("hello");
		l1.add(null);
		
		System.out.println("capacity is "+l1.capacity());
		System.out.println("l1--->"+l1);
		System.out.println("size is "+l1.size());

	}

}
