package FY2023;

import java.util.Vector;

public class VectorPgrm2
{

	public static void main(String[] args) 
	{
		Vector l1=new Vector();
		l1.add(10);
		l1.add(20.56);
		l1.add(10);
		l1.add(true);
		l1.add("hello");
		l1.add(null);
		
		System.out.println("The first Element of the vector is = "+l1.firstElement());
		
		System.out.println("The Last Element of the vector is = "+l1.lastElement());

		if(l1.contains("Tiger"))
		{
	    System.out.println("Tiger is present at the index "+l1.indexOf("Tiger"));
		}
		else
		{
	    System.out.println("Tiger is not present in the list.+");
		}
	}

}
